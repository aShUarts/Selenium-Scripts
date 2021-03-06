import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class AddCustomer {

	
	public static void CustomerAdd() {
		
		WebDriver driver= StaffLogin.driver;
		driver.findElement(By.linkText("Add Customer")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
        /*====================== FILLING CRM DETAILS =============================*/
        
        RandomGenerator rg= new RandomGenerator();  //Defining Random Generated Function
        String a=rg.generateRandomChars("QWERTYUIOPASDFGHJKLZXCVBNM", 5);//Defining input to select in the RGF
        
        //String b= rg.generateRandomChars("1234567890", 5); 
        
        driver.findElement(By.id("company_name")).sendKeys("Bruce Wayne Gotham"+a+"Pvt. Ltd.");
        driver.findElement(By.id("company_name")).sendKeys(Keys.TAB);
        driver.findElement(By.id("crm_cudtomer_email_id")).clear();
        driver.findElement(By.id("crm_cudtomer_email_id")).sendKeys("brucewaynegotham1"+a+"@mailinator.com");
        driver.findElement(By.id("crm_cudtomer_email_id")).sendKeys(Keys.TAB);
        Select dropdown1= new Select(driver.findElement(By.id("id_industry_master")));
        dropdown1.selectByVisibleText("Advocates");
        driver.findElement(By.id("id_industry_master")).sendKeys(Keys.TAB);
        driver.findElement(By.id("corporate_country")).sendKeys("India");
        driver.findElement(By.id("corporate_country")).sendKeys(Keys.TAB);
        driver.findElement(By.id("corporate_address1")).sendKeys("222 B");
        driver.findElement(By.id("corporate_address1")).sendKeys(Keys.TAB);
        driver.findElement(By.id("corporate_address2")).sendKeys("Baker Street");
        driver.findElement(By.id("corporate_address2")).sendKeys(Keys.TAB);
        driver.findElement(By.id("corporate_address3")).sendKeys("London");
        driver.findElement(By.id("corporate_address3")).sendKeys(Keys.TAB);
        driver.findElement(By.id("crm_cpd_person_name")).sendKeys("Bruce Wayne");
        driver.findElement(By.id("crm_cpd_email_id")).sendKeys("brucewaynegotham1"+a+"@mailinator.com");
        //email_id="brucewaynegotham1"+a+"@mailinator.com";
        driver.findElement(By.id("crm_cpd_designation")).sendKeys("IT");
        driver.findElement(By.id("crm_cpd_country_code")).sendKeys("India (91)");
        driver.findElement(By.id("crm_cpd_contact_no")).sendKeys("9211421545");
        driver.findElement(By.xpath(".//*[@id='CrmForm']/div[2]/div/div[6]/div[1]/div/a[1]/i")).click();
        driver.findElement(By.xpath(".//*[@id='account_manager']")).sendKeys("Virendra Bhati");
        driver.findElement(By.id("date_of_visit")).clear();
        driver.findElement(By.id("date_of_visit")).sendKeys("30-07-2016 00:00");
        driver.findElement(By.id("comment")).sendKeys("The Account Manager has been selected");
      // driver.findElement(By.xpath(".//*[@id='CrmForm']/div[2]/div/div[8]/input[1]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='CrmForm']/div[2]/div/div[8]/input[1]")).click();
      
	}

}
