import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.asergis.org/home/");
		driver.findElement(By.className("amp_login cboxElement")).click();
		driver.findElement(By.id("email")).sendKeys("nonindian.server@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		
	
	}

}