import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestiveDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).click();
		driver.findElement(By.id("src")).sendKeys("coim");
		
		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//List<WebElement> options = driver.findElements(By.cssSelector("ul[class='autoFill'] li"));
		 List<WebElement> options = driver.findElements(By.cssSelector("li[select-id*='results[']"));
		 System.out.println(options);
		
		for(WebElement option :options) 
		{
			if(option.getText().equalsIgnoreCase("Omni Bus Stand, Coimbatore"))
			{
				System.out.println(option.getText());
				option.click();
				break;
			}
		}
		
		 
	}

}
