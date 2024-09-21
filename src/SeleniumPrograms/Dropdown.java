package SeleniumPrograms;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	 ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
//		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();

		//Single dropdown

		WebElement sdd =driver.findElement(By.id("searchDropdownBox"));
		Select sc=new Select(sdd);
		
		sc.selectByIndex(4);
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		driver.navigate().back();
		
		sc.selectByVisibleText("Baby");
		WebElement submit1 = driver.findElement(By.xpath("//input[@type='submit']"));
		submit1.click();
		driver.navigate().back();
		
		sc.selectByValue("search-alias=freshmeat");
		WebElement submit2= driver.findElement(By.xpath("//input[@type='submit']"));
		submit2.click();
		
		
		
//		WebElement dd1 = driver.findElement(By.id("searchDropdownBox"));
//		Select sc1=new Select(dd1);
//		dd1.click();
//		sc1.selectByIndex(3);
//		
//		WebElement submit1 = driver.findElement(By.xpath("//input[@type='submit']"));
//		submit1.click();
//		
//		//select by visible text
//		
//		driver.navigate().back();
//		
//		WebElement dd2 = driver.findElement(By.id("searchDropdownBox"));
//		Select sc2=new Select(dd2);
//		dd2.click();
//		sc2.selectByVisibleText("Baby");
//		
//		WebElement submit2= driver.findElement(By.xpath("//input[@type='submit']"));
//		submit2.click();
//		
//		//select by value
//		
//		driver.navigate().back();
//		
//		WebElement dd3 = driver.findElement(By.id("searchDropdownBox"));
//		Select sc3=new Select(dd3);
//		dd3.click();
//		sc3.selectByValue("search-alias=freshmeat");
//			
//		WebElement Submit3 = driver.findElement(By.id("//input[@type='submit']"));
//		Submit3.click();
//		
//		//Is Multiple
//		
//		driver.navigate().back();
//		
//		WebElement dd4 = driver.findElement(By.id("searchDropdownBox"));
//		
//		Select sc4=new Select(dd4);
//		
//		boolean multiple = sc4.isMultiple();
//		System.out.println("Is It Multiple Drop Down:"+ multiple);
//				
//		WebElement dd5 = driver.findElement(By.id("searchDropdownBox"));
//		Select sc5=new Select(dd5);
//		List<WebElement> options = sc5.getOptions();
//		
//		for(WebElement option:  options) {
//			System.out.println(option.getText());
//		}
//		
//		
//		WebElement dd6= driver.findElement(By.id("searchDropdownBox"));
//		Select sc6=new Select(dd6);
//		
//		WebElement firstSelectedOption = sc6.getFirstSelectedOption();
//  	  System.out.println(firstSelectedOption.getText());
		
		
		//Multiple Dropdown
		
//		WebElement mdd = driver.findElement(By.id("cars"));
//		
//		Select sc1=new Select(mdd);
//    	  
//    	  boolean multiple2 = sc1.isMultiple();
//    	  System.out.println("Is It Multiple dropdown:" + multiple2 ); 
//    	  
//    	  sc1.selectByVisibleText("Volvo");
//    	  Thread.sleep(3000);
//    	
//    	  sc1.selectByValue("saab");
//    	  Thread.sleep(3000);
//    	  
//    	  sc1.selectByIndex(2);
//    	  List<WebElement> allSelectedOptions = sc1.getAllSelectedOptions();
//    	  
//    	  for (WebElement option1 : allSelectedOptions) {
//    		   
//    		  System.out.println(option1 .getText());
//    	  }
//    	 
//    	  WebElement firstSelectedOption2 = sc1.getFirstSelectedOption();
//    	  System.out.println(firstSelectedOption2.getText());
//    	  
//    	  sc1.deselectByVisibleText("Volvo");
//    	  Thread.sleep(3000);
//    	  
//    	  sc1.deselectByValue("saab");
//    	  Thread.sleep(3000);
//    	  
//    	  sc1.deselectByIndex(2);
//    	  
//    	  sc1.deselectAll();
      }
	
	   	
			
			
		}
		
	
	
	
