package Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;






public class RelativeLoc {



public static void main(String[] args) {

// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Neha Narain\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/angularpractice/");

WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));

System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());

WebElement dateofBirth= driver.findElement(By.cssSelector("[for='dateofBirth']"));

driver.findElement(((Object) withTagName("input")).below(dateofBirth)).sendKeys("02/02/1992");

WebElement iceCreamLabel=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

driver.findElement(((Object) withTagName("input")).toLeftOf(iceCreamLabel)).click();

//Get me the label of first Radio button

WebElement rb=driver.findElement(By.id("inlineRadio1"));

System.out.println(driver.findElement(((Object) withTagName("label")).toRightOf(rb)).getText());

}

private static Object withTagName(String string) {
	// TODO Auto-generated method stub
	return null;
}



}




