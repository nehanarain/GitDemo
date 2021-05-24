import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neha Narain\\OneDrive\\Documents\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
	    ChromeDriver driver1=new ChromeDriver();
	    driver1.get("https://www.path2usa.com/travel-companions");
	    //April 23
	    driver1.findElementByXPath(".//*[@id='travel_date']").click();


	    while(!driver1.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
	    {
	    driver1.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
	    }


	    List<WebElement> dates= driver1.findElements(By.className("day"));
	    //Grab common attribute//Put into list and iterate
	    int count=driver1.findElements(By.className("day")).size();

	    for(int i=0;i<count;i++)
	    {
	    String text=driver1.findElements(By.className("day")).get(i).getText();
	    if(text.equalsIgnoreCase("21"))
	    {
	    driver1.findElements(By.className("day")).get(i).click();
	    break;
	    }

	    }
	    }


}

	    
	


