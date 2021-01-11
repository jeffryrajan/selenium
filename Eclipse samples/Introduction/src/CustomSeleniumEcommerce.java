import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomSeleniumEcommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// find the price of a webelement from the list
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers"); 
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elementsList = driver.findElements(By.xpath("//tbody //tr //td[1]"));
		List<String> price = elementsList.stream().filter(s->s.getText().contains("Apple")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.stream().forEach(s->System.out.println(s));
		
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
