package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class qw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //belongs to general chrome profile
		DesiredCapabilities ch = new DesiredCapabilities();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);

	    //belongs to local browsers
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.driver.chrome","C:\\Users\\Neha Narain\\OneDrive\\Documents\\chromedriver.exe");
	    
				
	}

}
