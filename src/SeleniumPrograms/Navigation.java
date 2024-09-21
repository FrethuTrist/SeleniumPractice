package SeleniumPrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

    public static void main(String[] args) throws InterruptedException {
    // Automatically setup ChromeDriver
      ChromeDriver driver = new ChromeDriver();
        
    		driver.manage().window().maximize();
    		driver.get("https://www.facebook.com");
    		
    		String title = driver.getTitle();
    		System.out.println(title);
    		
    		driver.navigate().to("https://www.instagram.com");
    		
    		driver.navigate().back();
    		driver.navigate().refresh();
    		driver.navigate().forward();
    		driver.navigate().back();
    		
    		String title2 = driver.getTitle();
    		System.out.println(title2);
    		
    		WebElement username=driver.findElement(By.id("email"));
    		username.sendKeys("helenfreeda2701@gmail.com");
    		
    		WebElement pass=driver.findElement(By.id("pass"));
    		pass.sendKeys("Karthick2701");
    		Thread.sleep(1000);
    		driver.close();

        
    }
}
