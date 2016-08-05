import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class Provisioning {

	public static void ACProvision()
	{
		try {
		WebDriver driver= StaffLogin.driver;
		driver.findElement(By.xpath(".//*[@id='example']/thead/tr[2]/th[1]/span/input")).sendKeys(DBConnection.company_name);
		driver.findElement(By.linkText("Process")).click();
		driver.findElement(By.id("demoaccount-1")).click();
		driver.findElement(By.id("currency_code-INR")).click();
		driver.findElement(By.id("status")).sendKeys("Approved");
		driver.findElement(By.id("submitit")).click();
		driver.findElement(By.linkText("Provisioning")).click();
		driver.findElement(By.xpath("//input[@value='Company']")).sendKeys(DBConnection.company_name);
		driver.findElement(By.linkText("Add to Provision")).click();
		driver.findElement(By.id("typepaid-1")).click();
		driver.findElement(By.id("creditlimit")).clear();
		driver.findElement(By.id("creditlimit")).sendKeys("2000");
		driver.findElement(By.id("threshold_credit_limit")).sendKeys("2200");
		
		driver.findElement(By.xpath(".//*[@id='didtype-1']")).click();
		/*CRMClosure.driver.findElement(By.xpath(".//*[@id='didtype-1']")).sendKeys(Keys.SPACE);
		CRMClosure.driver.findElement(By.xpath(".//*[@id='didtype-0']")).sendKeys(Keys.SPACE);*/
		
		driver.findElement(By.xpath(".//*[@id='shared_did_country']")).sendKeys("India");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		List<WebElement> abc=driver.findElements(By.xpath("//input[@class='txtdd']"));
		for ( WebElement el : abc ) {
		      //if ( !el.isSelected() ) {
		          el.click();
		          driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		     // }
		  }
		System.out.println(abc.size());
		driver.findElement(By.xpath(".//*[@id='tariffplan']")).sendKeys("5");
		Select tz_dropdown = new Select(driver.findElement(By.xpath(".//*[@id='id_timezone']")));
		tz_dropdown.selectByValue("49");
		Select status_dropdown = new Select(driver.findElement(By.xpath(".//*[@id='status']")));
		status_dropdown.selectByValue("1");
		Select acpop_dropdown = new Select(driver.findElement(By.xpath(".//*[@id='id_ac_pop']")));
		acpop_dropdown.selectByValue("3");
		Select PLimit_dropdown = new Select(driver.findElement(By.xpath(".//*[@id='participant_limit']")));
		PLimit_dropdown.selectByValue("25");
		driver.findElement(By.xpath("//input[@value='Save and Continue for dialout Rate']")).click();
		
		Select custom_rate_dropdown = new Select(driver.findElement(By.id("outbound_country")));
	    custom_rate_dropdown.selectByVisibleText("India");
	    driver.findElement(By.xpath(".//*[@id='selecctalltxt']")).click();
	    driver.findElement(By.xpath("//input[@value='Next']")).click();
	    
	    List<WebElement> dialrb=driver.findElements(By.xpath("//input[@id='allow_all_dest']"));
	    System.out.println(dialrb.size());
	    dialrb.get(0).click();
	    driver.findElement(By.xpath("//input[@value='Next']")).click();
	    driver.findElement(By.id("outbound_country")).sendKeys("India");
	    driver.findElement(By.xpath(".//*[@id='selecctalltxt']")).click();
	    driver.findElement(By.xpath("//input[@value='Create Rate']")).click();	  
		
		} catch (Exception e) 
		     {
				System.out.println(e);
		     }
	
	
}
	/*public static void main(String args[])
	{
	 ACProvision();	
	}*/
}
