package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import genericLib.Driver;
import pageObjectRepoLib.*;

public class TestLogIn {
	WebDriver driver;
	//LogIn LI;
	LogIn2 LI;
	String[] url={"http://10.1.1.125/designhill/", "https://demo.designhill.com/main/"};

	@BeforeClass(groups={"smoke test","regression test"})
	public void beforeClass() {
		driver=Driver.getBrowser();
		//LI=PageFactory.initElements(Driver.driver,LogIn.class);
		LI=PageFactory.initElements(Driver.driver,LogIn2.class);
	}

	@Test(priority=1)
	// This test case test redirection of all tabs for logined user
	public void tabredirectiontest() {
		for(int i=0; i<=5; i++){
			Driver.driver.get(url[i]);  
			LI.LogInUser();
			LI.Tabtest();
			
		}

	} 
}
