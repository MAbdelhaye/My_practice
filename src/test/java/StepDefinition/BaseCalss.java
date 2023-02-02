package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseCalss {
public static WebDriver driver;
	
	public void openbrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver.exe");
			 driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
		} else {
			System.out.println("Invalid browser");
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void openApplication(String env) {
		if(env.equalsIgnoreCase("qa")) {
			driver.get("https://login.salesforce.com");
			driver.manage().window().maximize();
		}
	}


}
