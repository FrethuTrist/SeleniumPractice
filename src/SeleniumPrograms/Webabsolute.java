package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webabsolute {
	
	static WebDriver driver;
	
	public static void BrowserLaunch() {
		
       ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
	 
	
	System.out.println("******Heading Data's*********");
	System.out.println("       ");
	
	List<WebElement> Headings = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
	
  for(WebElement datas : Headings)	{
	
	String text = datas.getText();
	System.out.println(text);
}
  System.out.println("       ");
  System.out.println("******Australia Row*********");
	
	List<WebElement> ARow = driver.findElements(By.xpath("//table/tbody/tr[10]/td"));
	
for(WebElement datas : ARow)	{
	
	String info = datas.getText();
	System.out.println(info);
}

System.out.println("       "); 
System.out.println("******Currency Data*********");
System.out.println("       ");
WebElement ParticularData = driver.findElement(By.xpath("//table/tbody/tr[32]/td[4]"));

String info1 =ParticularData .getText();
System.out.println(info1);


  
	System.out.println("       "); 
	System.out.println("******Captital Data*********");
	System.out.println("       ");
	WebElement CapitalData = driver.findElement(By.xpath("//table/tbody/tr[62]/td[3]"));

	String info2 =CapitalData .getText();
	System.out.println(info2);
	
	}
  
  public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		BrowserLaunch();
	   
		
		
	}

}
