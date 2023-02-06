package Siddharthacademy.demoInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fireTVOptionMenu {
	
public WebDriver driver;
	
	
	By fireTVStickLite = By.xpath("//a[contains(text(),'Introducing: Fire TV Stick Lite')]");

	public fireTVOptionMenu (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFireTVStickLite() {
		return driver.findElement(fireTVStickLite);
	}


}
