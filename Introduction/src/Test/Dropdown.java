package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neha Narain\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
driver.get("https://www.spicejet.com/");
//driver.findElement(By.xpath("//*[@id=\"flightSearchContainer\"]/div[6]")).click();
//Select s = new Select (driver.findElement(By.xpath("//*[@id=\'divpaxinfo\']")));
driver.findElement(By.id("divpaxinfo")).click();
//driver.findElement(By.id("")).click();
 //Thread.sleep(2000L);
 
	}
 
	}


