package Siddharthacademy.demoInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class allIconMenu {
	public WebDriver driver;
	
	
	By fireTVOption = By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[8]/a[1]");

	public allIconMenu (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFireTVOption() {
		return driver.findElement(fireTVOption);
	}
}
