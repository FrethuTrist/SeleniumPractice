package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	static WebDriver driver;
	public Frames() {
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		singleFrames();
	}
	
	static void singleFrames() {
		
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Helen");
		
		driver.switchTo().defaultContent();
		
		multiFrame();
	}
	
    static void multiFrame() {
	
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	
	WebElement multiFrame=driver.findElement(By.xpath((""))
			
			driver.switchTo().frame(multiFrame);
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("))"
			String ExpectedResult="iFrame Demo";
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
