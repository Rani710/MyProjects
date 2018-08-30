import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		System.out.println("WEBDRIVER");
		File f1 = new File("D:\\\\Selenium\\\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",f1.getAbsolutePath());
		
		
	//	System.getProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
				

	}

}
