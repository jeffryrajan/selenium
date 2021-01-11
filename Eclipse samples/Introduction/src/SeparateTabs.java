import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeparateTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Assert.assertEquals(driver.findElements(By.tagName("a")).size(),27);
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement column1 = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column1.findElements(By.tagName("a")).size());
		//loop through the items
		for(int i = 1;i<column1.findElements(By.tagName("a")).size();i++) {
			
			String keyboard =Keys.chord(Keys.CONTROL,Keys.ENTER);
			column1.findElements(By.tagName("a")).get(i).sendKeys(keyboard);;
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
					
			
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			System.out.println(driver.switchTo().window(it.next()).getTitle());
		}
		
		
	}

}
