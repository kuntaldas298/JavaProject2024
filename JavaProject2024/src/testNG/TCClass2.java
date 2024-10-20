package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TCClass2 extends PrePostCondition{

	@Test (priority = 1)
	public void TC602_ChangeDP() {	
		Reporter.log("Create USer",true);
	}
	@Test (priority = 2)
	public void TC603_UpdateBio() {	
		Reporter.log("Add email",true);
	}
	@Test (priority = 1, groups = "regression")
	public void TC604_createUser() {	
		Reporter.log("Create USer",true);
	}
	@Test (priority = 1, groups = "regression")
	public void TC605_changeMobileNO() {	
		Reporter.log("change mobile no",true);
	}
	@Test (priority = 1, groups = "sanity")
	public void TC606_loadUser() {	
		Reporter.log("user loaded",true);
	}
}
