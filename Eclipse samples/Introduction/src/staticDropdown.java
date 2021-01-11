import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*
		 * driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); Select s =
		 * new
		 * Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		 * s.selectByValue("USD"); s.selectByIndex(0); s.selectByVisibleText("INR");
		 */
		driver.get("https://www.spicejet.com/");
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("divpaxinfo")).click();
			
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adult.selectByValue("2");
		Select child = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		child.selectByValue("2");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
