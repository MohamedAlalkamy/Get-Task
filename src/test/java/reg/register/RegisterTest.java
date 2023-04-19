package reg.register;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.RegisterPage;

public class RegisterTest extends TestBase {

	public JavascriptExecutor jse;
	RegisterPage reg_page_object;
	
	 String firstName="Mohamed";
     String lastName="Samir";
     String email="m@m.com";
     String phone="01016325464";
	
     @Test(priority = 1)
     public void register_success()
     {
       reg_page_object=new RegisterPage(driver);
       reg_page_object.userRegistration(firstName, lastName, email, phone);
       
       Select listoptions = new Select(driver.findElement(By.cssSelector("")));
       listoptions.selectByValue("selenium-automation");
       
  
       
       Select listoption = new Select(driver.findElement(By.cssSelector("#nf-field-24")));
       listoption.selectByValue("april");
       
       
    
       
     }
	
	
}
