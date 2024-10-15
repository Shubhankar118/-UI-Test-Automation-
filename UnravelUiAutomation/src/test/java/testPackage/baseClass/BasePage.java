package testPackage.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    public static WebDriver driver;
    Properties props = new Properties();
    public static Properties loc= new Properties();



    @BeforeTest
    public void setup() throws IOException {

        FileInputStream fis = new FileInputStream("src/test/java/testPackage/resources/config/config.properties");
        props.load(fis);
        FileInputStream fis1 = new FileInputStream("src/test/java/testPackage/resources/config/locators.properties");
        loc.load(fis1);


        String browser = props.getProperty("browser");
        String testurl = props.getProperty("testurl");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }
        else if (browser.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();
        }
        driver.get(testurl);

    }

    @AfterTest
    public void tearDown(){
        driver.quit();

    }
}
