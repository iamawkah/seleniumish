package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework {

public static void main(String[] args) {
		
WebDriver driver = new FirefoxDriver();
		
//Opens the web site
driver.get("http://www.phptravels.net");

//click on my account
driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();

//choose login
driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[1]/a")).click();
		
//Enter email
driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[4]/div/div[1]/input")).sendKeys("mahadiaK@yahoo.com");

//Enter password
driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[4]/div/div[2]/input")).sendKeys("HibaqKalfan123");

//Log in up
driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[4]/button")).click();
	
//Enter First Name
driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[3]/input")).sendKeys("Mahad");

//Enter Last Name
driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[4]/input")).sendKeys("Kalfan");	
	
//Enter Mobile Number	
driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[5]/input")).sendKeys("7034587631");
	
//Enter email
driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[6]/input")).sendKeys("mahadiaK@yahoo.com");

//Enter Password
driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[7]/input")).sendKeys("HibaqKalfan123");

//confirm password
driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[8]/input")).sendKeys("HibaqKalfan123");

//signed up 
driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[9]/button")).click();

//log out
//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();



driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();

//driver.findElement(By.xpath("")).sendKeys("");
	}

}
