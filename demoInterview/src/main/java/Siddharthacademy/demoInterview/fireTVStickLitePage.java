package Siddharthacademy.demoInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fireTVStickLitePage {
	
public WebDriver driver;
	
	
	By addToWishList = By.xpath("//a[contains(text(),'Add to Wish List')]");

	public fireTVStickLitePage (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAddToWishList() {
		return driver.findElement(addToWishList);
	}

}
