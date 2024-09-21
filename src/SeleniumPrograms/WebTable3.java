package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		System.out.println("*******Column Data's*********");
		
		List<WebElement> columnelements = driver.findElements(By.xpath("(//table)[1]/tbody/tr/td[2]"));
		
	for(WebElement datas : columnelements)	{
		
		String text = datas.getText();
		System.out.println(text);
		
	}
	
	
	}

}