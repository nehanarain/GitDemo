import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Neha Narain\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("//a[@class='signin']")).click(); 
		driver.findElement(By.cssSelector("input[id*='login']")).sendKeys("baba");
		driver.findElement(By.cssSelector("#password")).sendKeys("abcd");
		driver.findElement(By.cssSelector(".forgotlink > a:nth-child(1) > u:nth-child(1)")).click();
				
		//System.out.println(driver.getTitle());/
		driver.findElement(By.xpath("//*[@class='rTextfield']")).sendKeys("i am wise");
		driver.findElement(By.xpath("//div[@title='Next']/input[2]")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@class='content rcenter']/span")).getText());
	

	}
}