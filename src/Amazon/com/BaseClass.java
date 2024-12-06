package Amazon.com;

import org.openqa.selenium.WebDriver;


 
	
	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.Select;

	public class BaseClass {

		protected static WebDriver driver;
		
		

		// Browser Launch
		protected static WebDriver browserLaunch(String browserName) {

			if (browserName.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
			} else if (browserName.equalsIgnoreCase("IE")) {
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
			}

			driver.manage().window().maximize();

	return driver;
		}

		// Launch Url
		protected static void launchUrl(String UrlLink) {

			try {
				driver.get(UrlLink);
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("ERROR IN LAUNCHURL");
			}
		}

		// getTitle
		protected static void pageHeadline(WebDriver driver,String webPage) {
			if (webPage.equalsIgnoreCase("getTitle")) {
				String title = driver.getTitle();
				System.out.println("Title of the page: " + title);
			}else if (webPage.equalsIgnoreCase("getcurrenturl")) {
				String currentUrl = driver.getCurrentUrl();
				System.out.println("Url of the current tab: "+currentUrl);
			}
		}
		
		
		
		//quit
		protected static void exitBrowser(WebDriver driver,String exit) {
			
			if (exit.equalsIgnoreCase("close")) {
				driver.close();
			}else if (exit.equalsIgnoreCase("quit")) {
				driver.quit();
			}
		}

		// Implicitly wait
		protected static void waitconcepts(int time) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		}

		// Send Keys
		protected static void inputValue(WebDriver driver, WebElement element, String value) {
			try {
				element.sendKeys(value);
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("ERROR IN INPUTVALUE");
			}

		}

		// click
		protected static void clickElement(WebDriver driver, WebElement element) {
			try {
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("ERROR IN CLICKELEMENT");
			}
		}
		
		
		//getTExt
		protected static void catchVariables(WebDriver driver, WebElement element) {
		
			String text = element.getText();	
			System.out.println(text);
		}
		
		
		
		
		
		protected static void clearVaiables(WebDriver driver, WebElement element) {
			element.clear();
		}
		
		
		
		
		//takesScreenShot
		protected static void screenShot(String folderName) {
			TakesScreenshot shot = (TakesScreenshot) driver;
			File source = shot.getScreenshotAs(OutputType.FILE);
			File destination = new File("D:\\Ashlyn class\\JAVA\\eclipse\\A1\\IPTClasses\\ScreenShotFolder"+folderName+".png");
			try {
				FileHandler.copy(source, destination);
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("ERROR IN SCREENSHOT");
			}
		}
		
		
		
		
		
		//simpleDropDown
		protected static void selectDropdownOption(WebElement element, String selectionType, String selectionValue) {
			Select dropdown= new Select(element);
			if (selectionType.equalsIgnoreCase("text")) {
				dropdown.selectByVisibleText(selectionValue);
			}else if (selectionType.equalsIgnoreCase("value")) {
				dropdown.selectByValue(selectionValue);
			}else if (selectionType.equalsIgnoreCase("index")) {
				
				try {
					int index = Integer.parseInt(selectionValue);
					dropdown.selectByIndex(index);
				} catch (NumberFormatException e) {
					e.printStackTrace();
					System.err.println("ERROR IN SELECTDROPDOWNOPTION");
				}
			}
		}
	 
		
		//JavaScriptsExecutor
		protected static void scriptsExecutor(WebDriver driver,WebElement element,String action, String inputvalue) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			try {
				if (action.equalsIgnoreCase("sendkeys")) {
					element.sendKeys(inputvalue);
				}else if (action.equalsIgnoreCase("scrollIntoView")) {
					jse.executeScript("arguments[0].scrollIntoView();", element);
				}else if (action.equalsIgnoreCase("click")) {
					element.click();
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("ERROR IN SCRIPTSEXECUTOR");
			} 
			
		}	
		
		protected static void scrolUpDown(int x, int y ) {
			JavascriptExecutor jsr = (JavascriptExecutor) driver;
			try {
				jsr.executeScript("window.scrollBy("+x+","+y+")");
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("ERROR IN SCROLLUPDOWN");
			}
		}
		
		
		//action
		protected static void mouseActions(WebDriver driver,WebElement element1,WebElement element2, String action) {
			Actions mouse = new Actions(driver);
			
			try {
				if (action.equalsIgnoreCase("click")) {
					mouse.click(element1).build().perform();
				}else if (action.equalsIgnoreCase("doubleClick")) {
					mouse.doubleClick(element1).build().perform();
					
				}else if (action.equalsIgnoreCase("contextClick")) {
					mouse.contextClick(element1);
				}else if (action.equalsIgnoreCase("moveToElement")) {
					mouse.moveToElement(element1);
				}else if (action.equalsIgnoreCase("dragAndDrop")) {
					mouse.dragAndDrop(element1, element2);
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("ERROR IN MOUSEACTIONS");
			}
			
		}
		
		
		
		//keybord
		protected static void keyboardActions(String Key ) {
			try {
				Robot keyWork =new Robot();
				if (Key.equalsIgnoreCase("ENTER")) {
					keyWork.keyPress(KeyEvent.VK_ENTER);
				}else if (Key.equalsIgnoreCase("Down")) {
					keyWork.keyPress(KeyEvent.VK_DOWN);
				}
				
			} catch (AWTException e) {
				e.printStackTrace();
				System.err.println("ERROR IN KEYBOARDACTIONS");
			}
			
		}
		
		
		//navigate
		protected static void addressNavigation(WebDriver driver, String element, String action) {
			
			try {
				if (action.equalsIgnoreCase("to")) {
					driver.navigate().to(element);
				}else if (action.equalsIgnoreCase("backWard")) {
					driver.navigate().back();
				}else if (action.equalsIgnoreCase("forWard")) {
					driver.navigate().forward();
				}else if (action.equalsIgnoreCase("refresh")) {
					driver.navigate().refresh();
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("ERROR IN ADDRESSNAVIGATION");
			}
		}
		
		//alert
		protected static void popUpScreen(WebDriver driver, String pop,String confirmType,String inputValue) {
			
			Alert alert = driver.switchTo().alert();
			if (pop.equalsIgnoreCase("simple")) {
				alert.accept();
			}else if (pop.equalsIgnoreCase("confirm")) {
				if (confirmType.equalsIgnoreCase("accept")) {
					alert.accept();	
				}else if (confirmType.equalsIgnoreCase("dismiss")) {
					alert.dismiss();
				}
			}else if (pop.equalsIgnoreCase("prompt")) {
				alert.sendKeys(inputValue);
			}
		}
		
		//frames
		protected static void frame(WebDriver driver, WebElement element) {
			driver.switchTo().frame(element);
		}
		
		
		//windowHandle
		protected static void handlingWindows(WebDriver driver,int x) {
			try {
				List<String> alwin = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(alwin.get(x));
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("ERROR IN HANDLINGWINDOWS");
			}
			
		}
		
		
		
		

		}

   
   


