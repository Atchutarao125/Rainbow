package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaleElementRefExp {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
    //enter email address 
	WebElement UN = driver.findElement(By.xpath("//input[@id='email']"));
	//Refresh the page
	driver.navigate().refresh();
	UN.sendKeys("abc12@gamil.com");
	System.out.println("Boss i am from");


}
}
