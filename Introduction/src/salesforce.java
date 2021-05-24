import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
	// here introduction is test suite not treat as project we create demo.java is test case//
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neha Narain\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("11234");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		//compound classes not allow//
	//System.out.println(driver.findElement(By.cssSelector("#error")).getText());//
	driver.findElement(By.xpath(".//*[@id='forgot_password_link']/following-sibling::a[2]")).click();
	
		
		 
		
	}

}
