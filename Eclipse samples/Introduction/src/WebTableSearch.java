import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		// Check the search result
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers"); 
		driver.findElement(By.cssSelector("#search-field")).sendKeys("Rice");
		List<WebElement> list = driver.findElements(By.xpath("//tr//td[1]"));
		
		int c =list.size();
		List<WebElement> newList = list.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		int ac = newList.size();
		Assert.assertEquals(c,ac);

		System.out.println(" "+c+" "+ac);

	}

}
