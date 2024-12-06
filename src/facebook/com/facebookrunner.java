package facebook.com;

import Amazon.com.BaseClass;

public class facebookrunner extends BaseClass {
	
	public static void main(String[] args) {
		 facebookrunner kk = new facebookrunner();
		 kk.login();
		 
	}
    void login() {
    	browserLaunch("chrome");
    	launchUrl("https://www.facebook.com/");
    	facebooklogin nw = new facebooklogin();
    	
    	
    	inputValue(driver,nw.getLogin(),"7708299505");
    	inputValue(driver,nw.getPassword(),"merabhai");
    	clickElement(driver,nw.getSignin());
    	
    	
	 
 }
}
