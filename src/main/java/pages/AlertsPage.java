package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {
    WebDriver driver;

    @FindBy(id = "alertButton")
    private WebElement alertButton;

    @FindBy(id = "timerAlertButton")
    private WebElement timerAlertButton;

    @FindBy(id = "confirmButton")
    private WebElement confirmButton;

    @FindBy(id = "promtButton")
    private WebElement promptButton;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSimpleAlert() {
        alertButton.click();
        driver.switchTo().alert().accept();
    }

    public void clickTimerAlert() throws InterruptedException {
        timerAlertButton.click();
        Thread.sleep(6000); // wait for alert
        driver.switchTo().alert().accept();
    }

    public void clickConfirmAlert() {
        confirmButton.click();
        driver.switchTo().alert().dismiss();
    }

    public void clickPromptAlert(String text) {
        promptButton.click();
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
    }
}
