package reg.register;



import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import Utilities.Helper;


public class TestBase {


            WebDriver driver;
          
            @BeforeClass
            @Parameters({"browser"})
               void setupClass(@Optional("chrome") String browserName) {
                if (browserName.equalsIgnoreCase("chrome"))
                {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
                else if (browserName.equalsIgnoreCase("firefox"))
                {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }

                else if (browserName.equalsIgnoreCase("ie"))
                {
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                }


                else if (browserName.equalsIgnoreCase("ie"))
                {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                }


                // WebDriverManager.firefoxdriver().setup();
            }
            @Test
            @BeforeClass
            void setupTest() {
                //driver = new ChromeDriver();\
            	driver.manage().window().maximize();
                driver.get("https://codenboxautomationlab.com/registration-form/");
                driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
                //driver=new FirefoxDriver();

            }
            
            
            
            @AfterMethod
            public void screenShotOnFailure(ITestResult result)
             {
                 if (result.getStatus()==ITestResult.FAILURE)
                 {
                     System.out.println("Failed !!");
                     System.out.println("Taking Screensot ....");
                     Helper.captureScreenShot(driver,result.getName());
                 }
              }
            




}