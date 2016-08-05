import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SubUser {

	static WebDriver driver=StaffLogin.driver;
	static RandomGenerator rg= new RandomGenerator();  //Defining Random Generated Function
    static String a=rg.generateRandomChars("QWERTYUIOPASDFGHJKLZXCVBNM", 5);//Defining input to select in the RGF
    static String b=rg.generateRandomChars("123456789123456789",7);

	public static String str = DBConnectionCustomer.dbconnection();
    public static int couter =1;

	public static void CreateSubUser() throws InterruptedException
	{  
		couter++;

		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		StaffLogin.Slogin();
		driver.findElement(By.linkText("Sub User")).click();
		driver.findElement(By.linkText("Create Sub User")).click();
		//Defining Random Generated Function
		RandomGenerator rg= new RandomGenerator();  
		//Defining input to select in the RGF
        String a=rg.generateRandomChars("QWERTYUIOPASDFGHJKLZXCVBNM", 5);
        String b=rg.generateRandomChars("123456789123456789",7);
        driver.findElement(By.xpath(".//*[@id='subaccount_name']")).sendKeys("Jim Gordon Pvt.Ltd"+a);
        Select mobile_dropdown= new Select(driver.findElement(By.id("crm_cpd_country_code")));
		mobile_dropdown.selectByVisibleText("India (91)");
		driver.findElement(By.id("subaccount_mobile")).sendKeys("9"+b);
		driver.findElement(By.xpath(".//*[@id='subaccount_email']")).sendKeys("jimgordan"+a+"@mailinator.com");
		driver.findElement(By.xpath(".//*[@id='company_address']")).sendKeys(b+"B BAKER STREET");
		driver.findElement(By.xpath(".//*[@id='subaccount_username']")).sendKeys("JimGordon"+a);
		
		Select designation_dropdown= new Select(driver.findElement(By.id("designation")));
		designation_dropdown.selectByVisibleText("IT");
		
		Select phone_dropdown= new Select(driver.findElement(By.id("corporate_country_prefix")));
		phone_dropdown.selectByVisibleText("India (91)");
		
		driver.findElement(By.id("subaccount_phone")).sendKeys("9"+b);
		
		List<WebElement> did =driver.findElements(By.xpath("//label[@class='radio-mr']"));
		System.out.println(did.size());
		did.get(0).click();
		Select sdid_country_dropdown=new Select(driver.findElement(By.id("shared_did_country")));
		sdid_country_dropdown.selectByValue("All");
		List<WebElement> cb=driver.findElements(By.xpath("//input[@class='txtdd select_global_checkbox']"));
		
		System.out.println(cb.size());
		for(int i=0;i<cb.size();i++){
			cb.get(i).click();
		}
		
		driver.findElement(By.xpath(".//*[@id='submit']")).click();
		
		List <WebElement> servicetype=driver.findElements(By.xpath("//input[@class='servicetype']"));
		System.out.println(servicetype.size());
		for(int i=0;i<servicetype.size();i++)
		{
			servicetype.get(i).click();
		}
		driver.findElement(By.xpath(".//*[@id='ampapp']")).click();
		driver.findElement(By.xpath("//input[@class='profilemaster']")).click();
		driver.findElement(By.xpath("//input[@class='confmaster']")).click();
		driver.findElement(By.xpath("//input[@class='phonemaster']")).click();
		driver.findElement(By.xpath("//input[@class='accountmaster']")).click();
		driver.findElement(By.xpath("//input[@class='confsupportmaster']")).click();
		driver.findElement(By.xpath("//input[@class='listmessagemaster']")).click();
		driver.findElement(By.xpath("//input[@class='accountact']")).click();
		driver.findElement(By.xpath("//input[@class='confact']")).click();
		List <WebElement> confradio=driver.findElements(By.xpath("//input[@class='confradio']"));
        System.out.println(confradio.size());
        for (int i= 0;i<=confradio.size(); i=i+2)
        {
        	if(confradio.size()==i+2)
        	{   System.out.println(i);
        		break;
        	}
        	
        confradio.get(i).click();
        /*confradio.get(2).click();
        confradio.get(4).click();
        confradio.get(6).click();
        confradio.get(8).click();*/
        }
        driver.findElement(By.xpath("//input[@class='confsupportact']")).click();
		driver.findElement(By.xpath("//input[@class='messageact']")).click();
		driver.findElement(By.xpath("//input[@class='messageuploadact']")).click();
		driver.findElement(By.xpath("//input[@class='phoneact']")).click();
		List <WebElement> phoneradio=driver.findElements(By.xpath("//input[@class='phoneradio']"));
		System.out.println(phoneradio.size());
		phoneradio.get(0).click();
		phoneradio.get(2).click();		
		
		driver.findElement(By.xpath("//input[@class='profileact']")).click();
		
		driver.findElement(By.xpath(".//*[@id='submit']")).click();
		
		driver.findElement(By.id("success_messages")).getText();
	}

	public static void SubUserList()
	{
		//StaffLogin.Slogin();
		if(couter==2)
		{
		driver.findElement(By.xpath("//input[@value='Search Email']")).sendKeys("jimgordan"+a+"@mailinator.com");
		}
		else 
		{
			StaffLogin.Slogin();
			driver.findElement(By.linkText("Sub User")).click();
			driver.findElement(By.linkText("Sub User List")).click();			
			driver.findElement(By.xpath("//input[@value='Search Email']")).sendKeys(DBConnectionCustomer.email);
			driver.findElement(By.xpath(".//*[@id='datatable']/tbody/tr/td[5]/a[1]/i")).click();
			System.out.println(driver.findElement(By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div/a")).getText());
			System.out.println(driver.findElement(By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div/div[1]")).getText());
		}
		
		
		
	}
	
	public static void SuberUserListView()
	{
		
		
		
		
		
		
		
	}
	public static void DeactivateSubUserList()
	{
		StaffLogin.Slogin();
	}

public static void main(String args[]) throws InterruptedException
    {
		//CreateSubUser();
		SubUserList();
    	
    }
}
