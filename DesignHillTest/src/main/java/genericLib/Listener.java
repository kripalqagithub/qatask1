package genericLib;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;

public class Listener implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		String testName=result.getMethod().getMethodName();
		EventFiringWebDriver efw=new EventFiringWebDriver(Driver.driver);
		File srcImg=efw.getScreenshotAs(OutputType.FILE);
		File desImg=new File("C:\\Users\\kripal\\Documents\\workspace\\DesignHillTest\\screenshot"+testName+".png");
		try{
			FileUtils.copyFile(srcImg, desImg);
			}
			catch(IOException e){
			e.printStackTrace();
		}		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	}


