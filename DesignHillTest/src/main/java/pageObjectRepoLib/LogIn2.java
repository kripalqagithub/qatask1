package pageObjectRepoLib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import genericLib.Constants;
import genericLib.Driver;
import junit.framework.Assert;



public class LogIn2 extends genericLib.WebDriverCommonLib {
	@FindBy(id="loginControl_UserName")
	private WebElement email;
	
	@FindBy(id="loginControl_Password")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='loginControl_LoginButton']")
	private WebElement logInButton;
	
	
	
		
	public void LogInUser(){
		email.sendKeys(Constants.userName);
		password.sendKeys(Constants.password);
		logInButton.click();
//		waitForPageToLoad();
	 }
	
	public void Tabtest(){
		
		  List<WebElement> Columns_row = Driver.driver.findElements(By.xpath("//table[@id='ctl00_headerMenu']//img"));
		  System.out.println("Start  " +Driver.driver.getCurrentUrl() );
		  WebDriverWait wait = new WebDriverWait(Driver.driver, 5);
		  	  
		  System.out.println(Columns_row.size());		  
		  		  
		  for(int i = 0;i<Columns_row.size();i++){
			  Driver.driver.findElement(By.xpath("//img[@id='ctl00_headerMenu_DXI"+i+"_Img']")).click();
			  try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//label[@id='ctl00_mainContentPlaceHolder_titleLabel']")));
					String header = Driver.driver.findElement(By.xpath(".//label[@id='ctl00_mainContentPlaceHolder_titleLabel']")).getText();
					 System.out.println(header);
				 } catch (Exception e) {
					 try {
						 String header = Driver.driver.findElement(By.xpath("//label[@id='ctl00_mainContentPlaceHolder_ASPxLabel1']")).getText();
						 System.out.println(header);
					} catch (Exception e2) {
						System.out.println("Home Page");
					}
				}
		  }
		
		  }
	}

