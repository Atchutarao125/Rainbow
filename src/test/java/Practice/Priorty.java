
package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priorty {
@Test(priority=2)
public void A1() {
	Reporter.log("logout from the application ",true);
}
@Test(priority=1)
public void A2() {
	Reporter.log("log in the application ",true);
	
	
}
}
