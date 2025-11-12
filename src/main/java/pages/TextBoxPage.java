package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
    WebDriver driver;

    @FindBy(id = "userName")
    private WebElement fullName;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(id = "currentAddress")
    private WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddress;

    @FindBy(id = "submit")
    private WebElement submitBtn;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillForm(String name, String mail, String cAddr, String pAddr) {
        fullName.sendKeys(name);
        email.sendKeys(mail);
        currentAddress.sendKeys(cAddr);
        permanentAddress.sendKeys(pAddr);
        submitBtn.click();
    }
}
