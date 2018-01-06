package pageObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericLib.Constants;
import genericLib.Driver;
import junit.framework.Assert;

public class LogIn extends genericLib.WebDriverCommonLib {
	@FindBy(id="loginControl_UserName")
	private WebElement email;
	
	@FindBy(id="loginControl_Password")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='loginControl_LoginButton']")
	private WebElement logInButton;
	
	
	@FindBy(id="ctl00_headerMenu_DXI1_Img")
	private WebElement estimate_tab;

	@FindBy(id="ctl00_headerMenu_DXI2_Img")
	private WebElement order_tab1;
	
	@FindBy(id="ctl00_headerMenu_DXI3_Img")
	private WebElement po_tab;
	
	@FindBy(id="ctl00_headerMenu_DXI4_Img")
	private WebElement inventory_tab;
	
	@FindBy(id="ctl00_headerMenu_DXI5_Img")
	private WebElement crm_tab;
	
	@FindBy(id="ctl00_headerMenu_DXI6_Img")
	private WebElement proofs_tab;
	
	@FindBy(id="ctl00_headerMenu_DXI7_Img")
	private WebElement postage_tab;
	
	@FindBy(id="ctl00_headerMenu_DXI8_Img")
	private WebElement job_Cost;
	
	
	public void LogInUser(){
//		Driver.driver.get(Constants.url[]);
//		waitForPageToLoad();
		email.sendKeys(Constants.userName);
		password.sendKeys(Constants.password);
		logInButton.click();
//		waitForPageToLoad();
	 }
	
	public void Tabtest(){
		
        System.out.println("Navigation to Estimates Tab");
        estimate_tab.click();
//        waitForPageToLoad();
        String title = Driver.driver.getTitle();
        String url = Driver.driver.getCurrentUrl();
        System.out.println("User navigated to " +url);
        try {
            Assert.assertEquals(title, "Midnight");
        } catch (Exception e) {
        }
       
//        waitForPageToLoad();
        System.out.println("Navigation to Orders Tab");
        order_tab1.click();
//        waitForPageToLoad();
        String title1 = Driver.driver.getTitle();
        String url1 = Driver.driver.getCurrentUrl();
        System.out.println("User navigated to " +url1);
        try {
            Assert.assertEquals(title1, "Midnight");
        } catch (Exception e) {
        }
        
        System.out.println("Navigation to PO Tab");
        po_tab.click();
//        waitForPageToLoad();
        String title2 = Driver.driver.getTitle();
        String url2 = Driver.driver.getCurrentUrl();
        System.out.println("User navigated to " +url2);
        try {
            Assert.assertEquals(title2, "Midnight");
        } catch (Exception e) {
        }
        
        System.out.println("Navigation to Inventory Tab");
        inventory_tab.click();
//        waitForPageToLoad();
        String title3 = Driver.driver.getTitle();
        String url3 = Driver.driver.getCurrentUrl();
        System.out.println("User navigated to " +url3);
        try {
            Assert.assertEquals(title3, "Midnight");
        } catch (Exception e) {
        }
       
//        waitForPageToLoad();
        System.out.println("Navigation to CRM Tab");
        crm_tab.click();
//        waitForPageToLoad();
        String title4 = Driver.driver.getTitle();
        String url4 = Driver.driver.getCurrentUrl();
        System.out.println("User navigated to " +url4);
        try {
            Assert.assertEquals(title4, "Midnight");
        } catch (Exception e) {
        }
        
        System.out.println("Navigation to Proofs Tab");
        proofs_tab.click();
//        waitForPageToLoad();
        String title5 = Driver.driver.getTitle();
        String url5 = Driver.driver.getCurrentUrl();
        System.out.println("User navigated to " +url5);
        try {
            Assert.assertEquals(title5, "Midnight");
        } catch (Exception e) {
        }
        
        System.out.println("Navigation to Postage Tab");
        postage_tab.click();
//        waitForPageToLoad();
        String title6 = Driver.driver.getTitle();
        String url6 = Driver.driver.getCurrentUrl();
        System.out.println("User navigated to " +url6);
        try {
            Assert.assertEquals(title6, "Midnight");
        } catch (Exception e) {
        }
       
//        waitForPageToLoad();
        System.out.println("Navigation to Job Cost Tab");
        job_Cost.click();
//        waitForPageToLoad();
        String title7 = Driver.driver.getTitle();
        String url7 = Driver.driver.getCurrentUrl();
        System.out.println("User navigated to " +url7);
        try {
            Assert.assertEquals(title7, "Midnight");
        } catch (Exception e) {
        }
     } 
}
