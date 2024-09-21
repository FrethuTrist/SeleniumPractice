package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 {
	
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		System.out.println("*******Particular Data's*********");
		
		WebElement particularelement = driver.findElement(By.xpath("//table[1]/tbody/tr[5]/td[2]"));

			String singletext = particularelement.getText();
			System.out.println(singletext);
		
		
					}	

	}
