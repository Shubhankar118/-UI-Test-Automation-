package testPackage.testCases;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import testPackage.baseClass.BasePage;

import java.time.Duration;

public class LoginPage extends BasePage {


    @Test(priority = 1)
    public void LoginTest() throws InterruptedException {


        driver.findElement(By.xpath(loc.getProperty("usernameField"))).click();
        driver.findElement(By.xpath(loc.getProperty("usernameField"))).sendKeys("standard_user");
        driver.findElement(By.xpath(loc.getProperty("passwordField"))).click();
        driver.findElement(By.xpath(loc.getProperty("passwordField"))).sendKeys("secret_sauce");
        driver.findElement(By.xpath(loc.getProperty("loginButton"))).click();
        Thread.sleep(3000);

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
















    }
}
