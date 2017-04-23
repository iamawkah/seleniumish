package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HpTravelSolution {

	public static void main(String[] args) throws InterruptedException 
{
		
		int x = 1;
		while(x<20)
   {
	
		 
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://phptravels.net");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
		
		//Signup  
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
		
		//Sign by first name
		driver.findElement(By.name("firstname")).sendKeys("Lots");
		
		//Last name
		driver.findElement(By.name("lastname")).sendKeys("Monells");
		
		//phone
		driver.findElement(By.name("phone")).sendKeys("713458963");
	
		//email
		driver.findElement(By.name("email")).sendKeys("IsmailMohamed"+x+"@yahoo.com");
		
		//password
		driver.findElement(By.name("password")).sendKeys("Mercury123");
		
		//confirm passowrd
		driver.findElement(By.name("confirmpassword")).sendKeys("Mercury123");
		
		Thread.sleep(5000);
		//Sign up button
		driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[9]/button")).click();
				
		driver.close();
		x=x+1;
		
		
		
		

  }
}	
}