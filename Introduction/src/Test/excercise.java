package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Neha Narain\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	driver.get("https://www.google.com/account/about/privacy-tools/");
	driver.findElement(By.xpath("//*[@id=\"privacy\"]/div/div[2]/p/a")).click();
	System.out.println(driver.getTitle());
	Set<String>ids=driver.getWindowHandles();
	Iterator<String> it=ids.iterator();
	String parentid=it.next();
	String childid=it.next();
	driver.switchTo().window(childid);
	System.out.println(driver.getTitle());
	driver.switchTo().window(parentid);
	System.out.println("Switching Back to parent");
	System.out.println(driver.getTitle());
	

	}

}
