package testPackage.testCases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testPackage.baseClass.BasePage;

public class SearchPage extends BasePage {

    @Test(priority=2)
    public void search(){


        driver.findElement(By.xpath(loc.getProperty("Jacket"))).click();
        driver.findElement(By.xpath(loc.getProperty("AddToCart"))).click();
        driver.findElement(By.xpath(loc.getProperty("CartLink"))).click();




    }

}
