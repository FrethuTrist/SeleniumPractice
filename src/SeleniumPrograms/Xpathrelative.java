package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathrelative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Att name & Att value
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("helenfreeda2701@gmail.com");
		
		//Att name & Att value
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("hello1234");
		
		// using contains
		WebElement login = driver.findElement(By.xpath("//button[contains(@type,'sub')]"));
		login.click();
		
			}

}
