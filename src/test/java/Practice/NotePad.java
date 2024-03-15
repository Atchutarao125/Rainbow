package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class NotePad {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\for_selenium\\TestNGATCHUTH\\src\\test\\java\\Practice\\notepad ");
	Properties p=new Properties();
	p.load(fis);
	
	String UserName = p.getProperty("UserName");
	System.out.println(UserName);
	
	String PassWord = p.getProperty("PassWord");
	System.out.println(PassWord);
	
	String Company = p.getProperty("Company");
    System.out.println(Company);
	
	
		
	}
}

