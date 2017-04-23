package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverhomework {

	public static void main(String[] args) {
		
		//Open Firefox web browser
		WebDriver driver = new FirefoxDriver();
		
		//Launch Mercury website
		driver.get("http://newtours.demoaut.com");
		
		//Get the title of the page
		driver.getTitle();
		
		//Print the title of the page
		System.out.println(driver.getTitle());
		
		//Click on "Register" link
		driver.findElement(By.linkText("REGISTER")).click();
		
		//Enter first Name
		driver.findElement(By.name("firstName")).sendKeys("Ismail");
		
		//Enter last name
		driver.findElement(By.name("lastName")).sendKeys("Mohamed");
		
		//Enter phone number
		driver.findElement(By.name("phone")).sendKeys("1245362546");
		
		//Enter e-mail   userName
		driver.findElement(By.name("userName")).sendKeys("hag@gmail.com");
		
		//Enter Address   address1
		driver.findElement(By.name("address1")).sendKeys("1254 Hill Side Dr.");
		
		//Enter City     city
		driver.findElement(By.name("city")).sendKeys("Manassas");
		
		//Enter state   state
		driver.findElement(By.name("state")).sendKeys("Va");
		
		//Enter Postal zipcode   postalCode
		driver.findElement(By.name("postalCode")).sendKeys("20114");
		
		//Enter username
		driver.findElement(By.name("postalCode")).sendKeys("20114");
		
		//Enter user name  email
		driver.findElement(By.name("email")).sendKeys("Ismail");
		
		//Enter user password    password
		driver.findElement(By.name("password")).sendKeys("Habahaba");
		
		//Confirm password   confirmPassword
		driver.findElement(By.name("confirmPassword")).sendKeys("Habahaba");
		
		//Click on Register   
		driver.findElement(By.name("register")).click();
		
		//Close the program
		driver.close();
		
		
		//For drop down windows like in this example that is asking you for a 
		//secret question type in the whole question ie what high school 
		//did you go to
		
	}

}
