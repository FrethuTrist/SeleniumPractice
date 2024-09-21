package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	  String text = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p']")).getText();
	      String user = text.substring(11);
	  	
	      
	      String text1 = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p']")).getText();
	      String pass = text1.substring(11);
	  	
	      WebElement un = driver.findElement(By.name("username"));
	      un.sendKeys(user);
		
		WebElement pw = driver.findElement(By.name("password"));
		pw.sendKeys(pass);
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		
	}

}
