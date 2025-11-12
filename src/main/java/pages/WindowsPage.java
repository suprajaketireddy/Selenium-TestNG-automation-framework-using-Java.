package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Set;

public class WindowsPage {
    WebDriver driver;

    @FindBy(id = "tabButton")
    private WebElement newTabButton;

    @FindBy(id = "windowButton")
    private WebElement newWindowButton;

    public WindowsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void handleNewTab() {
        String parent = driver.getWindowHandle();
        newTabButton.click();
        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles) {
            if (!handle.equals(parent)) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }
        driver.switchTo().window(parent);
    }

    public void handleNewWindow() {
        String parent = driver.getWindowHandle();
        newWindowButton.click();
        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles) {
            if (!handle.equals(parent)) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }
        driver.switchTo().window(parent);
    }
}
