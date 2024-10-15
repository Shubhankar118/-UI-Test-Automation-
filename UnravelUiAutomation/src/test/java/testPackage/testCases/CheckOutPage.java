package testPackage.testCases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testPackage.baseClass.BasePage;


public class CheckOutPage extends BasePage {

    @Test(priority=3)
    public void CheckOut(){

        driver.findElement(By.xpath(loc.getProperty("checkoutButton"))).click();
        driver.findElement(By.xpath(loc.getProperty("FName"))).click();
        driver.findElement(By.xpath(loc.getProperty("FName"))).sendKeys("Shub");
        driver.findElement(By.xpath(loc.getProperty("LName"))).click();
        driver.findElement(By.xpath(loc.getProperty("LName"))).sendKeys("Das");
        driver.findElement(By.xpath(loc.getProperty("PinCode"))).click();
        driver.findElement(By.xpath(loc.getProperty("PinCode"))).sendKeys("713391");
        driver.findElement(By.xpath(loc.getProperty("ContinueButton"))).click();




    }



}
