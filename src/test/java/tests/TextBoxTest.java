package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class TextBoxTest extends BaseTest {

    @Test
    public void testTextBoxForm() {
        driver.get("https://demoqa.com/text-box");
        test.info("Navigated to Text Box page");
        System.out.println("Navigated to Text Box page");

        driver.findElement(By.id("userName")).sendKeys("Supraja");
        driver.findElement(By.id("userEmail")).sendKeys("supraja@test.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad");
        driver.findElement(By.id("permanentAddress")).sendKeys("India");
        System.out.println("User details entered succesfully");

        driver.findElement(By.id("submit")).click();
        test.pass("Form submitted successfully");
        System.out.println("Form submitted successfully");

        WebElement output = driver.findElement(By.id("output"));
        Assert.assertTrue(output.isDisplayed());
        System.out.println("Output displayed successfully");
    }
}
