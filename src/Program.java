import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Program{

	public static void main(String args[])
	
	{
	//	File f1 = new File("D:\\\\Selenium\\\\lib\\\\chromedriver.exe");
				
		System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer_Win32_3.13.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		//driver.get("http://www.google.com");
				
		driver.navigate().to("http://www.gmail.com");
				
	/*	WebDriver driver1 = new ChromeDriver();
		driver1.get("http://www.guru99.com");
	*/	
	}	
}


/*
import java.util.Calendar;
import java.util.Formatter;

public class test{
   public static void main(String args[]) {
      Formatter fmt = new Formatter();
      Calendar cal = Calendar.getInstance();
      fmt = new Formatter();
      fmt.format("%tl:%tM", cal, cal);
      System.out.println(fmt);
   }
}

*/