package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		System.out.println("*******Row Data's*********");
		
		List<WebElement> rowelements = driver.findElements(By.xpath("(//table)[1]/tbody/tr[2]/td"));
		
	for(WebElement datas : rowelements)	{
		
		String rowelements1 = datas.getText();
		System.out.println(rowelements1);
	}
		

	}
	}
