import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Dynamicdropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		WebElement suggestions = driver.findElement(By.id("ui-id-1"));
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List <WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1'] //li //div"));
		
		//System.out.println(list.get(1).getText());
		
		
		for(WebElement option :list) 
		{

			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.id("autocomplete"))).sendKeys(Keys.ARROW_DOWN).build().perform();
			
			if(option.getText().contains("United Kingdom"))
			{
				
				System.out.println(option.getText());
			    Assert.assertEquals(option.getText(), driver.findElement(By.id("autocomplete")).getAttribute("value"));
				break;
			}
			
		}
		

		
		/*
		 * for(int i=0; i<list.size();i++) { Keys key = Keys.ARROW_DOWN;
		 * list.get(i).sendKeys(key); String name1 = list.get(i).getText();
		 * System.out.println(name1); if(name1.contains("United Kingdown")) { break; }
		 * 
		 * }
		 */
		
	}
	

}
