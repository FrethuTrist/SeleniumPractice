package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scpalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		
		driver.manage().window().maximize();
		
		// simple alert
		WebElement simplealert = driver.findElement(By.id("alertexamples"));
		 simplealert.click();
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().alert().accept();
		
		 //Scroll Down
		 
		 Thread.sleep(3000);
		 
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 
		 js.executeScript("window.scrollBy(0,5000);");
		
		
		  //confirm alert
		 
		 WebElement confirmalert = driver.findElement(By.id("confirmexample"));
		 confirmalert.click();
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().alert().accept();
		 confirmalert.click();
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().alert().dismiss();
		 
		 //prompt alert
		 
       Thread.sleep(3000);
		 
		 JavascriptExecutor js1=(JavascriptExecutor) driver;
		 
		 js1.executeScript("window.scrollBy(0,5000);");
		
		 
		 WebElement promptalert = driver.findElement(By.id("promptexample"));
		 promptalert.click();
		 
		 Thread.sleep(3000);
		 
		 String text = driver.switchTo().alert().getText();
		 System.out.println(text);
		 
		 driver.switchTo().alert().sendKeys("Hello World");
		 
		 driver.switchTo().alert().accept();
		 
		 
	}

}
