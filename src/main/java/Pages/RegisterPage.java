package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class RegisterPage extends PageBase  {

	WebDriver driver;
	
	
	 public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	


   

     @FindBy(id = "nf-field-17")
   
     WebElement fn_txtbox;

     @FindBy(id = "nf-field-18")
     
     WebElement ln_txtbox;

     @FindBy(id = "nf-field-19")
    
     WebElement email_txtbox;

     @FindBy(id = "nf-field-20")
    
     WebElement phone_txtbox;
     
     
     
     @FindBy(xpath ="//*[@id=\"nf-label-class-field-23-1\"]")
     
     WebElement KnowAboutUs;
     
     

     @FindBy(id = "nf-field-15")
     
     WebElement register_btn;

    



     public void userRegistration(String firstname , String lastname , String email , String phone)
     {
           
         setElementText(fn_txtbox,firstname);
         setElementText(ln_txtbox,lastname);
         setElementText(email_txtbox,email);
         setElementText(phone_txtbox,phone);
     
         
         clickButton(KnowAboutUs);
         clickButton(register_btn);
         
     }

	
	
}
