package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Creditcard {

	public static void main(String[] args) {
		
		//Open Firefox web browser
		WebDriver driver = new FirefoxDriver();
		
		//Launch Credit Karma website
		driver.get("https://www.creditkarma.com/");
		
		//Get your free credit scores
		driver.findElement(By.linkText("Get your free scores")).click();
		
		//Fill out email name
		driver.findElement(By.id("email")).sendKeys("AdamMyahoo.com");
		
		//Confirm email
		driver.findElement(By.id("retypeemail")).sendKeys("AdamMyahoo.com");
		
		//Create Password
		driver.findElement(By.id("password")).sendKeys("Baloons123");
		
		//Confirm Password
		driver.findElement(By.id("retypepw")).sendKeys("Baloons123");
		
		//securityQuestion
		//driver.findElement(By.id("secqcode")).click();
		
		//Security Question pick
		//driver.findElement(By.id("secqcode")).sendKeys();
		
		//Enter Security code choice
		//driver.findElement(By.id("secqcode")).sendKeys("");
		
		//secqans
		driver.findElement(By.id("securityQuestion")).sendKeys("What is your mother's maiden name?");
		
		driver.findElement(By.id("secqans")).sendKeys("Mardoog");
		
		
		
		
		
	}

}
