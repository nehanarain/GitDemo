package Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class miscelenious {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Neha Narain\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.google.com/");
	File src	=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("D:\\Pictures\\screenshot.png"));
				
	}

}
