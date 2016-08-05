import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class StaffLogin {
	/*	Defining Driver for Selenium Operations.*/	
	
	public static WebDriver driver= new FirefoxDriver(); 
	
	
	public static void Slogin() {
		
						/*Hit to the URL*/
		driver.get("http://192.168.101.186/login.php");
						/*Key-in the UserID*/
		driver.findElement(By.id("email")).sendKeys("virendra.bhati@asergis.in");
						/*Key-in the Password*/
		driver.findElement(By.id("password")).sendKeys("welcome");
					/*Click on Submit Button for Login*/
		driver.findElement(By.id("submit")).click();
		       			/*TimeDelay*/
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        		
	}

	/*public static void main(String args[])
	{
		Slogin();
	}*/
}
