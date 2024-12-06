package Amazon.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPOM extends BaseClass {

	 	  public AmazonLoginPOM() {
	 		
	 	  PageFactory.initElements( driver, this);
	 		  
		}
	
	@FindBy(id = "nav-link-accountList-nav-line-1")
	private WebElement signin;
	
	@FindBy(id = "ap_email" )
	private WebElement phonenum ;
	
	
	@FindBy(id = "continue")
	private WebElement continuebut;
	
	@FindBy(id = "ap_password")
	private WebElement password;
	
	@FindBy(id = "signInSubmit")
	private WebElement signinclick;
	
	
	 public WebElement getsigninbut() {
     return signin;
		
	}
	
	  public WebElement getphonenum() {  
      return phonenum;
		   
	}
	 
	   public WebElement getcontinuebut() {
		   return continuebut;
		 
	}
	  public WebElement getpassword() {
		  return password;
	}
	 public WebElement getsignin() {
		 return signinclick;

	}
}
