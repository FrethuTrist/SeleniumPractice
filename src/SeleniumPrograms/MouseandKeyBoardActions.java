package SeleniumPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseandKeyBoardActions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
//		Actions mouse=new Actions(driver);
//		
//	WebElement icon= driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_books']"));
//	mouse.click(icon).build().perform();
//	
//	Thread.sleep(3000);
//	
//	WebElement contextclick = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
//	mouse.contextClick(contextclick).build().perform();
//	
//	Thread.sleep(3000);
//	
//	WebElement doubleclick = driver.findElement(By.xpath("(//a[@class='nav-a  '])[10]"));
//	mouse.doubleClick(doubleclick).build().perform();
//	
//	Thread.sleep(3000);
//	
//	WebElement drag = driver.findElement(By.xpath("(//a[@class='nav-a  '])[10]"));
//	
//	WebElement drop = driver.findElement(By.id("twotabsearchtextbox"));
	
//	mouse.dragAndDrop(drag, drop).build().perform();
//	
//	
//	WebElement mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[6]"));
//	mouse.moveToElement(mobiles).build().perform();
	
		Actions ac=new Actions(driver);
		
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	ac.click(search).build().perform();
	
		
	Robot k=new Robot();
	
	k.keyPress(KeyEvent.VK_M);
	k.keyPress(KeyEvent.VK_O);
	k.keyPress(KeyEvent.VK_B);
	k.keyPress(KeyEvent.VK_I);
	k.keyPress(KeyEvent.VK_L);
	k.keyPress(KeyEvent.VK_E);
	k.keyPress(KeyEvent.VK_ENTER);
	
	}
}

