package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
 WebDriver driver = new ChromeDriver();
 @Test
 public void A1() {
	 driver.get("https://www.facebook.com");
 }
}
