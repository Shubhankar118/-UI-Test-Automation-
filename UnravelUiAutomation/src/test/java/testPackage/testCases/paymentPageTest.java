package testPackage.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testPackage.baseClass.BasePage;

public class paymentPageTest extends BasePage {


    @Test(priority=4)

    public void PaymentTest(){
        String paymentInformation = driver.findElement(By.xpath("(//div[@class='summary_value_label'])[1]")).getText();
        String totalPriceValue = driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText();

        System.out.println("Payment Information: " + paymentInformation);
        System.out.println("Total Price: " + totalPriceValue);


        driver.findElement(By.xpath(loc.getProperty("FinishButton"))).click();


    }

}
