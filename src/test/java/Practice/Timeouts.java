package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts {
@Test(timeOut = 9)
public void A1() {
Reporter.log("i am a timeouts",true);

}
}
