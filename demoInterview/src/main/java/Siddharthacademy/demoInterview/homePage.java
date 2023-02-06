package Siddharthacademy.demoInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	public WebDriver driver;
	
	By allIcon = By.xpath("//header/div[@id='navbar']/div[@id='nav-main']/div[1]/a[1]/span[1]");
	
	public homePage (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAllIcon() {
		return driver.findElement(allIcon);
	}

}
