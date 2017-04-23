package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String [] args){
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Ismail");
		
		driver.findElement(By.name("lastName")).sendKeys("Khalif");
		
		driver.findElement(By.name("phone")).sendKeys("74136541236");
		
		driver.findElement(By.name("userName")).sendKeys("Habahaba");
		
		
		//address1
		driver.findElement(By.name("address1")).sendKeys("1245 hill");
		
		//city
		driver.findElement(By.name("city")).sendKeys("Manassas");
		
		driver.findElement(By.name("state")).sendKeys("Va");
		
		driver.findElement(By.name("postalCode")).sendKeys("12545");
		
		
		//city
	}
	
}
