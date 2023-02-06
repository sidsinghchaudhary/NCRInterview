package Siddharthacademy.demoInterview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class base {
	
	public WebDriver driver;
	
	//WebDriverManager.chromedriver().setup();
	public WebDriver intializeDriver() {
		
		System.setProperty("webdriver.chrome.driver","users\\shilpar\\downloads\\chromedriver_mac_arm64\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}

}
