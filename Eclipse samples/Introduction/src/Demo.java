import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/imghp?hl=en&tab=ri&ogbl");
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
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("selenium");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/button/div/span")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		}

}
