package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestCaseClass1 extends PrePostCondition{
	
	@Test (priority = 1)
	public void TC502_ChangeDP() {	
		Reporter.log("Chage DP",true);
	}
	@Test (priority = 2)
	public void TC503_UpdateBio() {	
		Reporter.log("Update Bio",true);
	}
	@Test (priority = 3)
	public void TC504_DisableAC() {	
		Reporter.log("disable accout",true);
	}
}
