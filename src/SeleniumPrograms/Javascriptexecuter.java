package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecuter {

	public static <JavascriptExecuter> void main(String[] args) {
		// TODO Auto-generated method stub


		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		//Java Script Executer
		
		JavascriptExecutor j= (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,range);");
		j.executeScript("window.scrollBy(0,10000);");
		
		System.out.println("page scroll Down");
		
		j.executeScript("window.scrollBy(0,-5000);");
		System.out.println("page scroll Down");
		
		
		//js.executeScript("arguments[0].scrollntoView();",WebElementName)
		//driver.findElement(By.xpath("))
		
		WebElement element = driver.findElement(By.xpath("//img[contains(@alt,'Seven Seas HD High Definition')]"));
		
		j.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println("Element is Viewed");
		
		
		
		
		
		
	}

}
