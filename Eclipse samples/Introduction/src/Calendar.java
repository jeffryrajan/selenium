import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");
//https://rahulshettyacademy.com/AutomationPractice/
		driver.findElement(By.id("travel_date")).click();

		// driver.findElement(By.className("datepicker-switch")).click();

		String curMonth = driver
				.findElement(By.cssSelector("div[class='datepicker-days'] th[class*='datepicker-switch']")).getText();
		System.out.println(curMonth);

		/*
		 * while(!driver.findElement(By.
		 * cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText
		 * ().contains("May")) { driver.findElement(By.
		 * cssSelector("[class='datepicker-days'] th[class='next']")).click(); }
		 */

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("November")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();

		}

		/*
		 * Change Month List<WebElement> month =
		 * driver.findElements(By.cssSelector("span[class*='month']"));
		 * 
		 * for(int i=0;i<month.size();i++) {
		 * 
		 * if(month.get(i).getText().equalsIgnoreCase("Nov")) { month.get(i).click();
		 * break; }
		 * 
		 * }
		 */

		
		 //Select date
		int count = driver.findElements(By.className("day")).size();
		 List<WebElement> day= driver.findElements(By.cssSelector("td.day"));
		 
		 for(int i=0; i< count;i++) {
		  
		  String date = driver.findElements(By.cssSelector("td.day")).get(i).getText();
		  System.out.println(date); if(date.equalsIgnoreCase("16")) {
		 driver.findElements(By.className("day")).get(i).click(); break; }
		  
		  }
		 
	}

}
