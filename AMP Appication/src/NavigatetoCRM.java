import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NavigatetoCRM {


	public static void NCRM() {
		
		    WebDriver driver= StaffLogin.driver;
		    driver.findElement(By.linkText("Admin Panel")).click();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.findElement(By.linkText("CRM")).click();
	}

}
