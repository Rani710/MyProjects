import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\lib\\\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	
    	driver.get("http://www.facebook.com/");
    	
    	WebElement userName = driver.findElement(By.name("email"));
    	
    	WebElement passWord = driver.findElement(By.name("pass"));
    	
    	userName.sendKeys("rani.katragadda@gmail.com");
    	
    	passWord.sendKeys("*rani@fbk*");
    	
    	Thread.sleep(1000);
    	
    	WebElement login = driver.findElement(By.id("u_0_2"));
    	
    	login.click();
    	
    	System.out.println("Log in successfull...");
    	
    	//userName.clear();
    	//passWord.clear();
    	
    	driver.quit();
    	
    	
	}

}
