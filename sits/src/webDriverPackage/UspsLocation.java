package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UspsLocation {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		//Open Web browser
		driver.get("https://www.usps.com/");
		
		//Expands Web browser
		//driver.manage().window().maximize();
		
		//Wait for few seconds
		//Thread.sleep(5000);
		
		//Click on Quick tools by xpath
		driver.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[2]/a/span")).click();
		
		//Click on Find UPS Locations
		driver.findElement(By.xpath(".//*[@id='shortcuts-menu']/div[1]/div[3]/div[3]/a/span")).click();
		
		//Enter Zip code as 20878
		driver.findElement(By.xpath(".//*[@id='tCityStateZip']")).sendKeys("20878");
		
		//Change the distance
		
		//driver.findElement(By.xpath("")).click();		
		
		//Click Search
		driver.findElement(By.xpath("/html/body/div[1]/div[9]/div/div/div[1]/div[3]/div/div/form/fieldset/span/span/input")).click();
		

	}
	
}
