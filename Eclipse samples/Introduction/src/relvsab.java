import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relvsab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
/*		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jeffryrajan");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
		driver.findElement(By.xpath("//button[@name='login']")).click(); 
*/

/*		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("jeffryrajan");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("123");
		driver.findElement(By.cssSelector("[name='login']")).click();
*/
		//xpath - parent/child traverse
		driver.findElement(By.xpath("//div[@class='_8esj _95k9 _8esf _8opv _8f3m _8ilg _8icx _8op_ _95ka']/div/div[2]/div/div"
				+ "/form/div/div[1]/input")).sendKeys(("123"));
		
		//a[contains(text(),'Marketing Centre')]
		driver.findElement(By.cssSelector("#pass"));
		driver.findElement(By.xpath("//*[text()='Log In']")).click(); //To find element by text
		
		}

}
