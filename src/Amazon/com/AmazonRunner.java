package Amazon.com;

public class AmazonRunner extends BaseClass{

	public static void main(String[] args) {
		
		AmazonRunner run = new AmazonRunner();
		
		run.Loginpage();
	}	
		
		 
		 
		
		
	private void Loginpage() {
       browserLaunch("chrome");
	   launchUrl("https://www.amazon.in/");
	   AmazonLoginPOM login = new AmazonLoginPOM();
	   clickElement(driver,login.getsigninbut()) ;
	   inputValue(driver,login.getphonenum(),"7708299505");
	   clickElement(driver, login.getcontinuebut());
	   inputValue(driver, login.getpassword(),"rashiq2011");
	   clickElement(driver, login.getsignin());
	}	
		
		
		
		 

		
		
	
}
