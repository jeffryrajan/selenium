import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSotingPagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// find the price of a webelement by searching all pages
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers"); 
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elementsList = driver.findElements(By.xpath("//tbody //tr //td[1]"));
		
		List<String> price;
		do {
		
			List<WebElement> elementsList1 = driver.findElements(By.xpath("//tbody //tr //td[1]"));	
		price = elementsList1.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.stream().forEach(s->System.out.println(s));
		
		if(price.size()<1) {
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			
		}}while(price.size()<1);
				
		
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

	}

