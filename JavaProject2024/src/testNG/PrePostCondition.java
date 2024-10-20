package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//this class consists only pre and post conditions
public class PrePostCondition {
	@BeforeSuite (alwaysRun = true)
	public void beforesuit() {	
		Reporter.log("beforesuit",true);
	}
	@BeforeTest (alwaysRun = true)
	public void beforetest() {	
		Reporter.log("beforetest",true);
	}
	@BeforeClass (alwaysRun = true)
	public void beforeclass() {	
		Reporter.log("beforeclass",true);
	}
	@BeforeMethod  (alwaysRun = true)
	public void TC500_Login() {	
		Reporter.log("Login",true);
	}
	@AfterMethod  (alwaysRun = true)
	public void TC501_Logout() {	
		Reporter.log("Logout",true);
	}
//	@Test (priority = 1)
//	public void TC502_ChangeDP() {	
//		Reporter.log("Change DP",true);
//	}
//	@Test (priority = 2)
//	public void TC503_UpdateBio() {	
//		Reporter.log("Update Bio",true);
//	}
//	@Test (priority = 3)
//	public void TC504_DisableAC() {	
//		Reporter.log("disable account",true);
//	}
	@AfterClass (alwaysRun = true)
	public void afterclass() {	
		Reporter.log("afterclass",true);
	}
	@AfterTest (alwaysRun = true)
	public void aftertest() {	
		Reporter.log("aftertest",true);
	}
	@AfterSuite (alwaysRun = true)
	public void aftersuit() {	
		Reporter.log("aftaftersuiterclass",true);
	}
}
