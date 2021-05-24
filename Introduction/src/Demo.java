import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
	// here introduction is test suite not treat as project we create demo.java is test case//
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neha Narain\\OneDrive\\Documents\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("babab");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		System.out.println(driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText());
	
	
	
	
	
	
	
	
	
	
	
	}}
				
			
		
	
		
		 
		
	

