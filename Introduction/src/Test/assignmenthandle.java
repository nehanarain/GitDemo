package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignmenthandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Neha Narain\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[33]/a")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/a")).click();
	//System.out.println(driver.getTitle());
	Set<String> ids =driver.getWindowHandles();
	Iterator<String> it= ids.iterator();
	String parentwindow =it.next();
	
	driver.switchTo().window(it.next());
	System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
	driver.switchTo().window(parentwindow);
	System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/h3")).getText());
	
	
	
	
	
	

	
	
	}

}
