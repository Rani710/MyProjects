import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program to open gmail login page in firefox");
		
		File f1 = new File("D:\\\\Selenium\\\\lib\\\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",f1.getAbsolutePath());
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://gmail.com");
		
		driver.navigate().to("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys(new String[]{"testing2018"});
	    driver.findElement(By.name("password")).sendKeys(new String[]{"password"});
	    driver.findElement(By.name("login")).click();
	    
	    //check whether user name text box is present
	   // driver.findElement(By.name("userName")).isDisplayed())
	    
	       /* driver.findElement(By.name("userName")).sendKeys(new String[]{"testing2018"});
	        driver.findElement(By.name("password")).sendKeys(new String[]{"password"});
            driver.findElement(By.name("login")).click();
	    */
	    
	    driver.findElement(By.linkText("SIGN-OFF")).click();
	    driver.quit();
		
		

	}

}
