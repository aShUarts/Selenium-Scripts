import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PreAccount {

	public static void PAccount() throws SQLException
	{   WebDriver driver= StaffLogin.driver;
		DBConnection.dbconnection();
		
		try
		{
		driver.findElement(By.xpath(".//*[@id='crm_list']/thead/tr[3]/th[6]/span/input")).sendKeys(DBConnection.email_id);
		}
		catch (Exception e) {
			// : handle exception
			System.out.println("error");
		}
		driver.findElement(By.xpath(".//*[@id='crm_list']/tbody/tr[1]/td[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("button2")).click();
		driver.findElement(By.id("product_type")).sendKeys("Audio Conferencing");
		driver.findElement(By.xpath(".//*[@id='CrmCloserForm']/div[2]/input[1]")).click();
		
		}
		
		/*public static void main (String args[]) throws SQLException
		{
			  PAccount();
		}*/
	}

