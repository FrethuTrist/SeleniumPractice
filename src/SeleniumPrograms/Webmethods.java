package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
        
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement password= driver.findElement(By.name("pass"));
		password.sendKeys("HELEN");
		
		boolean selected = password.isSelected();
		System.out.println("Is Selected"+" "+selected);
		
		boolean displayed= password.isDisplayed();
		System.out.println("Is Displayed"+" "+displayed);
		
		
		String attribute = password.getAttribute("pass");
		System.out.println("Attribute is"+" " +attribute);

		String attribute1 = password.getAttribute("name");
		System.out.println("Attribute is"+" " +attribute1);
		
		
		
		WebElement login = driver.findElement(By.name("login"));
		boolean enabled = login.isEnabled();
		System.out.println("Is Enabled"+" " +enabled);
		
		
		String attribute2 = login.getAttribute("name");
		System.out.println("Attribute is"+" "+attribute2);
		
		
		login.click();
		
		driver.close();
	}

}
