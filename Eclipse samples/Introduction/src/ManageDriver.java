import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class ManageDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*
		 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		 * driver.manage().deleteCookieNamed("asd");
		 */
		driver.get("https://www.redbus.in/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://screenshot.png"));
	
		
	}

}
