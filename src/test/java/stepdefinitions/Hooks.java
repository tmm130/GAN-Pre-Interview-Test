package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void openBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			String url = "https://moneygaming.qa.gameaccount.com/";
			driver.get(url);
		}catch (Exception e) {
			System.out.println("Chrome driver load issue");
		}
	}
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
