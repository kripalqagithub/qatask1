package genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
		public static WebDriver driver;
		public static WebDriver getBrowser(){
			
			if(Constants.browser.equals("chrome")){
				System.setProperty("webdriver.chrome.driver","C://SeleniumFiles//GeckoBrowserDriver//chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			}else if(Constants.browser.equals("ie")){
				System.setProperty("webdriver.chrome.driver","C://SeleniumFiles//GeckoBrowserDriver//IEDriverServer.exe");
				driver=new InternetExplorerDriver();
				driver.manage().window().maximize();
			}else if(Constants.browser.equals("firefox")){
				  driver = new FirefoxDriver();
				  driver.manage().window().maximize();
			}else{
				//driver = new FirefoxDriver();
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			}
			return driver;
		}
	}
