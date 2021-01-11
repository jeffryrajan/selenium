import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RealTimeExercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String xpath = "//div[@id='checkbox-example'] /fieldset/label[2]";
		driver.findElement(By.xpath(xpath+"/input ")).click();
		
		String value = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(value);
		
		driver.findElement(By.id("dropdown-class-example")).click();
		
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText(value);
		
		driver.findElement(By.name("enter-name")).sendKeys(value);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertValue = driver.switchTo().alert().getText().split(",")[0].split(" ")[1];
		 if(alertValue.contains(value))

	     {

	    System.out.println("Alert message success");

	     }

	     else

	    System.out.println("Something wrong with execution");

	
		Assert.assertEquals(alertValue, value);
		driver.switchTo().alert().accept();
		
	}

}

