package Siddharthacademy.demoInterview;

public class amazonProductTest extends base{
	
	public void initialize() throws Exception{
	driver = intializeDriver();
	driver.get("www.amazon.in");
	}
	
	public void validateAddtoWishList() {
		allIconMenu am = new allIconMenu(driver);
		am.getFireTVOption().click();
		
		fireTVOptionMenu fom = new fireTVOptionMenu(driver);
		fom.getFireTVStickLite().click();
		
		fireTVStickLitePage fsp = new fireTVStickLitePage(driver);
		fsp.getAddToWishList().click();
	}

}
