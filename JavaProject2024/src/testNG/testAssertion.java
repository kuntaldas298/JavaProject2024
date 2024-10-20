package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class testAssertion {
	SoftAssert sa = new SoftAssert();
	
	@Test (priority = 1, dependsOnMethods = "TC703_Login")
	public void TC702_Register() {	
		Reporter.log("Create USer1",true);
		Reporter.log("Create USer2",true);
		Reporter.log("Create USer3",true);
		Reporter.log("Create USer4",true);
		//Assert.fail("reasons");
		//sa.fail("soft assert - reasons");
		Reporter.log("Create USer5",true);
		Reporter.log("Create USer6",true);
		//sa.assertAll();
	}
	@Test (priority = 1, dependsOnMethods = "TC702_Register")
	public void TC703_Login() {	
		Reporter.log("Login",true);
		Assert.fail();
	}
	@Test (priority = 1)
	public void TC704_dummy() {	
		Reporter.log("dummy",true);
	}
	
	
}
