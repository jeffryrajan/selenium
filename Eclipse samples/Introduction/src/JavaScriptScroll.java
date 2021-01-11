import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> price = driver.findElements(By.cssSelector("table[name='courses'] td:nth-child(3)"));
		
		int total = 0;
		
		for(int i=0;i<price.size();i++) {
			total = total + Integer.parseInt(driver.findElements(By.cssSelector("table[name='courses'] td:nth-child(3)")).get(i).getText());
		}
		
		System.out.println(total);
		
		List<WebElement> rowCount = driver.findElements(By.cssSelector("table[name='courses'] tr"));
		int rCount = rowCount.size();
		System.out.println("Number of rows = "+rCount);
		
		List<WebElement> columnCount = driver.findElements(By.cssSelector("table[name='courses'] th"));
		int cCount = columnCount.size();
		System.out.println("Number of rows = "+cCount);
		
		System.out.println(driver.findElement(By.cssSelector("table[name='courses'] tr:nth-child(3)")).getText());
		
	}

}
