package Test;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neha Narain\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    int j=0;
	    String[] itemsNeeded = {"Cucumber","Brocoli","Beetroot"};
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    Thread.sleep(3000);
	    additems(driver,itemsNeeded);
	}	    
	
	    
	  public static void additems(WebDriver driver,String[] itemsneeded)
	  {
		  List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		     for (int i=0;i<products.size();i++)
		     {
		     String[] name=products.get(i).getText().split("-");
		     String formattedName=name[0].trim();
		     
		     //format it to get actual vegetable name
		     // check whether name you extracted is present in array or not-
		     //convert array into array list for easy search  LIST al = Arrays.asList(geeks);
		     List<String> itemNeededList = Arrays.asList(itemsneeded);
		  
		     if(itemNeededList.contains(formattedName))
		    		 {
		    	 int j = 0;
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		     if(j==itemsneeded.length)
		     {
		     break;
		     
			}

		}}
			}

			private static void addItems(WebDriver driver, String[] itemsNeeded) {
				// TODO Auto-generated method stub
				
			}}

	  
	  
    