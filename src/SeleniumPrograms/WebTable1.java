package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		System.out.println("*******All Data's*********");
		
		List<WebElement> allelements = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
		
	for(WebElement datas : allelements)	{
		
		String text = datas.getText();
		System.out.println(text);
	}
		

	}

}
