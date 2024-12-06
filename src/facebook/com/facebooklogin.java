package facebook.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Amazon.com.BaseClass;

public class facebooklogin extends BaseClass {
	
	public facebooklogin() {

		 PageFactory.initElements( driver, this);
	}

	
	
	@FindB(id = "email")
	private WebElement signin;
	
	@FindBy(id ="pass")
	private WebElement password;
	
	@FindBy (name ="login")
	private WebElement login;
	
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
} 
