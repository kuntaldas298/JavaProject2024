package testNG;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.BasePublicEncryptionKey;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class hello {
	//execution happens based on the alphabetical order by default
	//by default the priority = 0, it can be negative, positive cannot be variable
	//default invocationCount = 1, cannot b - negative,0, variable - it is like loop.
	//DataProvider provieds data to other tests to execute
	@DataProvider (name = "dp1")
	public String[] values() {
		String var[]= {"a","b","c"};
		return var;
		}
	@Test (priority = 3)
	public void TC402_DoStuff() {
		
		Reporter.log("Do Stuff",true);
		
	}
	@Test (priority = 2, dataProvider = "dp1" )
	public void TC403_CreateUser(String value) {
		
		Reporter.log("Create new user "+value,true);
		
	}
	@Test (priority = 4)
	public void TC401_Logout() {
		
		Reporter.log("Logout",true);
	}
	@Test (priority = 1)
	public void TC400_Login() {
		Reporter.log("Login",true);
	}

}
