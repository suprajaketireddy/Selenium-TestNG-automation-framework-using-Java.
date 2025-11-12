package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FramesPage {
    WebDriver driver;

    public FramesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String readTextFromFrame1() {
        driver.switchTo().frame("frame1");
        String text = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(text);
        driver.switchTo().defaultContent();
        return text;
    }

    public String readTextFromFrame2() {
        driver.switchTo().frame("frame2");
        String text1 = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(text1);
        driver.switchTo().defaultContent();
        return text1;
    }
}
