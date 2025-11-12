package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class FramesTest extends BaseTest {

    @Test
    public void testFrameHandling() {
        driver.get("https://demoqa.com/frames");
        test.info("Navigated to Frames page");
        System.out.println("Navigated to Frames page");

        driver.switchTo().frame("frame1");
        test.info("Switched to Frame 1");
        System.out.println("Switched to Frame 1");

        WebElement heading = driver.findElement(By.id("sampleHeading"));
        String text = heading.getText();
        System.out.println("Frame text: " + text);
        test.pass("Frame selected successfully");

        driver.switchTo().defaultContent();
        System.out.println("Switched back to main content");

        Assert.assertEquals(text, "This is a sample page");
        System.out.println("Frame verified successfully");
    }
}
