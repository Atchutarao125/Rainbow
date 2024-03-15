package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=10)
	public void A1() {
		Reporter.log("hii good morning to all",true);
	}

}
