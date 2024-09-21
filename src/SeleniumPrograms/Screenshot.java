package SeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 ChromeDriver driver = new ChromeDriver();
	        
 		driver.manage().window().maximize();
 		driver.get("https://www.facebook.com");
 		
 		//Before Screenshot
 		//Screenshot syntax
 		
 		TakesScreenshot ss = (TakesScreenshot) driver;
 		
 		File src1 = ss.getScreenshotAs(OutputType.FILE);
 		
 		File destin1 = new File("C:\\Users\\sathi\\eclipse-workspace\\SelePr\\Selenium Learning\\Screenshot folder\\Sample1.png");
 		FileHandler.copy(src1, destin1);
 		
 		WebElement password= driver.findElement(By.name("pass"));
		password.sendKeys("HELEN");
		
		//After Screenshot
		
        File src2 = ss.getScreenshotAs(OutputType.FILE);
 		
 		File destin2 = new File("C:\\Users\\sathi\\eclipse-workspace\\SelePr\\Selenium Learning\\Screenshot folder\\Sample2.png");
 		FileHandler.copy(src2, destin2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
