import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		Select adult = new Select(driver.findElement(By.id("Adults")));
		adult.selectByValue("2");
		Select children = new Select(driver.findElement(By.id("Childrens")));
		children.selectByValue("2");
		driver.findElement(By.cssSelector(".icon.ir.datePicker")).click();
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-active ']")).click();	
		driver.findElement(By.cssSelector("#MoreOptionsLink")).click();
		driver.findElement(By.cssSelector("#AirlineAutocomplete")).sendKeys("JetAirways");
		driver.findElement(By.cssSelector("#SearchBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("#homeErrorMessage")).getText());
		
	}

}
