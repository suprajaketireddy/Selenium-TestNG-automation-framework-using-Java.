package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class AlertsTest extends BaseTest {

    @Test
    public void testAlertHandling() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        test.info("Navigated to Alerts page");
        System.out.println("Navigated to Alerts page");

        driver.findElement(By.id("alertButton")).click();
        test.info("Clicked on alert button");
        System.out.println("Clicked on alert button");

        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);
        alert.accept();
        test.pass("Alert accepted successfully");

        Assert.assertTrue(alertText.contains("clicked"));
        System.out.println("Alert handled successfully");
    }
}
