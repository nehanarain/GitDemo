package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neha Narain\\OneDrive\\Documents\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    
driver.get("http://qaclickacademy.com/practice.php");
System.out.println(driver.findElements(By.tagName("a")).size());

WebElement footerdriver= driver.findElement(By.id("gf-BIG"));//class="gf-t" id="gf-BIG"
footerdriver.findElements(By.tagName("a")).size();
WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
coloumndriver.findElements(By.tagName("a")).size();

for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
{
	
String clickonlinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
	
	coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);	
	
	
	
	}
	
Set<String> abc=driver.getWindowHandles();
Iterator<String> it=abc.iterator();
while(it.hasNext()) {
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
}



	}}


;