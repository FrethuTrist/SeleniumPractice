package SeleniumPrograms;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactinminiproject {
	
static WebDriver driver;
	
public static void BrowserLaunch()  {
		
        ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
 
//login
		WebElement UserName= driver.findElement(By.id("username"));
		UserName.sendKeys("Helen2701");
		
		WebElement PassWord = driver.findElement(By.id("password"));
		PassWord.sendKeys("7KBWFJ");
		
		WebElement Login = driver.findElement(By.id("login"));
		Login.click();
		

//		UserCredentials
		
//		Syntax: Select sc=new Select();	
		
		WebElement Location = driver.findElement(By.id("location"));
		Select Sc1 =new Select(Location);
		Location.click();
		
		Sc1.selectByVisibleText("Sydney");
		
		boolean multiple = Sc1.isMultiple();
		System.out.println("Multiple option:" + multiple);
		
		WebElement Selecthotel = driver.findElement(By.id("hotels"));
		Select Sc2 =new Select( Selecthotel);
		Selecthotel.click();
		
		 Sc2.selectByValue("Hotel Sunshine");
		 
		 WebElement RoomType = driver.findElement(By.id("room_type"));
		 Select Sc3 =new Select(RoomType);
		 RoomType.click();
			
		 Sc3.selectByIndex(3);
		 
		 List<WebElement> options = Sc3.getOptions();
		 for(WebElement dd:options) {
			 System.out.println(dd.getText());
		 }
			 
		 WebElement Noofrooms = driver.findElement(By.id("room_nos"));
		 Select Sc4 =new Select(Noofrooms );
		 Noofrooms .click();
				
		 Sc4.selectByIndex(2);
		
		 WebElement CheckIn= driver.findElement(By.id("datepick_in"));
		 CheckIn.sendKeys("20/08/2024");
		 
		 WebElement Checkout= driver.findElement(By.id("datepick_out"));
		 Checkout.sendKeys("23/08/2024");
		 
		 WebElement Adultperroom = driver.findElement(By.id("adult_room"));
		 Select Sc5 =new Select(Adultperroom);
		 Adultperroom .click();
			
	     Sc5.selectByValue("2");
	    
	     WebElement childrenperroom = driver.findElement(By.id("child_room"));
		 Select Sc6 =new Select(childrenperroom);
		 childrenperroom .click();
			
	     Sc6.selectByIndex(2);
	     
	     WebElement Search = driver.findElement(By.id("Submit"));
	     Search.click();
	     
	     System.out.println("Credentials Entered Successfully");
 
	     
//Select Option
		     
	     WebElement radiobutton = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	     radiobutton.click();
	     
	     WebElement Continue = driver.findElement(By.id("continue"));
		 Continue.click();
		 
	
//User Credentials1
		
		 
		 WebElement FirstName= driver.findElement(By.id("first_name"));
		 FirstName.sendKeys("heelennn");
		 
		 driver.navigate().refresh();
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 WebElement FirstName1= driver.findElement(By.id("first_name"));
		 FirstName1.sendKeys("helen");
		 
		 WebElement LastName= driver.findElement(By.id("last_name"));
		 LastName.sendKeys("Freeda");
		 
		 WebElement BillingAddress= driver.findElement(By.xpath("//textarea[@class='txtarea']"));
		 BillingAddress.sendKeys("No.123, Abc Street,Chennai-600035");
		 
		 WebElement CreditCardNo= driver.findElement(By.id("cc_num"));
		 CreditCardNo.sendKeys("56790432718953162");
		 
		 WebElement CreditCardType= driver.findElement(By.id("cc_type"));
		 Select Sc7 =new Select(CreditCardType );
		 CreditCardType .click();
				
		 Sc7.selectByIndex(3);
		 

		WebElement ExpiryMonth = driver.findElement(By.name("cc_exp_month"));
		Select Sc8 =new Select(ExpiryMonth);
		ExpiryMonth.click();
			
		Sc8.selectByVisibleText("November");
		
		 WebElement ExpiryYear = driver.findElement(By.id("cc_exp_year"));
		 Select Sc9=new Select(ExpiryYear);
		 ExpiryYear .click();
		 
		Sc9.selectByIndex(16);  
  
		WebElement CVVNumber= driver.findElement(By.id("cc_cvv"));
		CVVNumber.sendKeys("768"); 
		 
		Actions ac=new Actions(driver);
		
		 WebElement BookNow= driver.findElement(By.id("book_now"));
		 ac.click(BookNow).build().perform();

		System.out.println("Credentials1 Entered Successfully");
		
		
		System.out.println("--------All Datas-------");
		
		List<WebElement> getelements = driver.findElements(By.xpath("(//table)[3]/tbody/tr/td"));
		
		for(WebElement info : getelements)	{
			
			String text = info.getText();
			System.out.println(text);
			
			//Before Screenshot
	 		//Screenshot syntax
	 		
			
		}
		
}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 BrowserLaunch(); 
    	      
	}
}
