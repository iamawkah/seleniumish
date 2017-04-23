package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SITSRegistration {
	
	public static void main(String[] args){
		
		WebDriver  driver =  new  FirefoxDriver();
		
		
		//Navigate to http://72.83.64.113:90/enrollmentsystemdev
		driver.get("http://72.83.64.113:90/enrollmentsystemdev");
		
		//Click on Login
		driver.findElement(By.xpath(".//*[@id='ctl00_lnkLogOut']/cufon/canvas")).click();
		
	}

}
