package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step1: Launch web browser
		WebDriver browser = new FirefoxDriver();
		
		//Step2: Enter http://www.google.com
		browser.get("http://www.google.com");
		
		//Step3: Enter Herndon, VA by  XPATH
		browser.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("Herndon, VA");
		
		//Stpep3: Enter Herndon, Va by name
		browser.findElement(By.name("q")).sendKeys("Herndon, VA");
		
		//Click on search button
		browser.findElement(By.name("fZl")).click();
		
		//Click on search 
		browser.findElement(By.name("")).click();
		
	}

}
