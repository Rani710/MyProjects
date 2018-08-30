import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG2 {
	
			    public static void main(String[] args) throws InterruptedException {
	    	//System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\lib\\geckodriver.exe");
			    	
			System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\lib\\\\chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	
	    	driver.get("http://www.facebook.com/");
	    	
	   // 	WebElement chkFBPersist = driver.findElement(arg0)
	    	
	        Thread.sleep(10000);
	       
	        
	   //     driver.quit();
	    	
	  //  	driver.get("http://www.popuptest.com/popuptest2.html");
	    	
	    //	Thread.sleep(10000);
	    	
	    	
	        /*String baseUrl = "http://www.facebook.com";
	        String tagName = "";
	        String title;
	        String pageSource;
	        String url;
	  	        
	        driver.get(baseUrl);
	        title = driver.getTitle();
	        System.out.println("Title :" +title);
	       
	        url = driver.getCurrentUrl();
	        System.out.println("Current URL:" +url);
	        
	        driver.navigate().to(baseUrl);
	       */ 
	        
	        
	       // tagName = driver.findElement(By.id("email")).getTagName();
	       // System.out.println(tagName);
	   //  driver.close();
	    // driver.quit();
	     //   System.exit(0);
	}


}
