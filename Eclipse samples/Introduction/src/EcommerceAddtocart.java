import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerceAddtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); //impilicit wait
		WebDriverWait w= new WebDriverWait(driver, 5); // explicit wait
		
		String[] products = { "Tomato", "Beans", "Beetroot" };
		// invoke URL
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		EcommerceAddtocart obj = new EcommerceAddtocart(); 
		obj.addItems(driver,products);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
	
	public void addItems(WebDriver driver, String[] products)
	{
		

		List<WebElement> list = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < list.size(); i++) {

			String productName = list.get(i).getText();
			String[] splitName = productName.split("-");
			String formattedName = splitName[0].trim();
			List productsList = Arrays.asList(products);

			int j = 0;
			if (productsList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				
				if (j == products.length) {
					break;
				}
			}

		}
	}
}