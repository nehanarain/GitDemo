package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newbase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neha Narain\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			    WebDriver driver= new ChromeDriver();
			    int j=0;
			    String[] itemsNeeded = {"Cucumber","Brocoli","Beetroot"};
			    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			    Thread.sleep(3000);
			    addItems(driver,itemsNeeded);
			    base b= new base();

	}

	
	public static void addItems(WebDriver driver,String[] itemsneeded)	
	{
		int j=0;
		
		
	}
	}


