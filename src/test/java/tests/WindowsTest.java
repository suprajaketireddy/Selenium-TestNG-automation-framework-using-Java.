package tests;

import java.util.Set;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class WindowsTest extends BaseTest {

    @Test
    public void testNewWindow() {
        driver.get("https://demoqa.com/browser-windows");
        test.info("Navigated to Browser Windows page");
        System.out.println("Navigated to Browser Windows page");

        String parent = driver.getWindowHandle();
        driver.findElement(By.id("tabButton")).click();
        System.out.println("Clicked on new tab button");
        test.info("Clicked on new tab button");

        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(parent)) {
                driver.switchTo().window(window);
                System.out.println("Switched to new tab");
                String heading = driver.findElement(By.id("sampleHeading")).getText();
                test.pass("New tab handled successfully");
                Assert.assertEquals(heading, "This is a sample page");
                driver.close();
                System.out.println("Closed new tab");
            }
        }
        driver.switchTo().window(parent);
        System.out.println("Switched back to parent window");
    }
}
