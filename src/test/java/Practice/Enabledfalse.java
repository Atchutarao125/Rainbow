package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabledfalse {
@Test(enabled=false)
public void A1() {
	Reporter.log("i am a enabled false",true);
}
}
