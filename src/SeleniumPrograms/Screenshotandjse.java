package SeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotandjse {
	
	  ChromeDriver driver = new ChromeDriver();
	  TakesScreenshot tsst = (TakesScreenshot) driver;
	  JavascriptExecutor jse= (JavascriptExecutor) driver;
	
	public void beforescreenshot() throws IOException {
	        
	 		driver.manage().window().maximize();
	 		driver.get("https://www.amazon.in/");
	 		
	 		File source = tsst.getScreenshotAs(OutputType.FILE);	
	 		File destination = new File("C:\\Users\\sathi\\eclipse-workspace\\SelePr\\Selenium Learning\\Screenstfolder\\picture1.png");
	 		FileHandler.copy(source, destination);
	 			
	 		}
	 		
	public void searchingaelement() throws InterruptedException {
		
		WebElement SearchBar= driver.findElement(By.id("twotabsearchtextbox"));
		SearchBar.sendKeys("Books");
		Thread.sleep(3000);
		
	}
	
	
	public void afterscreenshot() throws IOException {
		

		File source2 = tsst.getScreenshotAs(OutputType.FILE);
 		
 		File destination2 = new File("C:\\Users\\sathi\\eclipse-workspace\\SelePr\\Selenium Learning\\Screenstfolder\\picture2.png");
 		FileHandler.copy(source2, destination2);
		
	}
	
	public void pgdown() {
		
		
        jse.executeScript("window.scrollBy(2000,-1000);");
		
		System.out.println("page scroll Down");
		
		
		jse.executeScript("window.scrollBy(0,-1000);");
		System.out.println("page scroll Down");

		
	}
	
	
	public void elementviewed() throws InterruptedException {
		
		WebElement element = driver.findElement(By.xpath("//img[contains(@alt,'LAKMÉ Peach Milk Moisturizer SPF 24 Sunscreen Lotion,Locks Moisture')]"));
		
		Thread.sleep(3000);
		
		jse.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println("Element is Viewed");
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Screenshotandjse scshotjse=new Screenshotandjse();
		scshotjse.beforescreenshot();
		scshotjse.searchingaelement();
		scshotjse.afterscreenshot();
		scshotjse.pgdown();
		scshotjse.elementviewed();
		
	}

}
