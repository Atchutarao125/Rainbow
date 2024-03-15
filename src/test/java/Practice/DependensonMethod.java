package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependensonMethod {
@Test
public void A1() {
	Reporter.log("login to the application",true);
}
@Test(dependsOnMethods = {"login"})
public void A2() {
	Reporter.log("logout from the application ",true);

}
}
