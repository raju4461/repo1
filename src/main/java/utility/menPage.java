package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class menPage {
	WebDriver driver;
	@FindBy(xpath="") public WebElement menskinny;
	
	public menPage(WebDriver driver) {
		this.driver=driver;
		}
		
	
	public menPage clickSkinnyJeans() { 
		Shared.click(menskinny);
		return new menPage(driver);
	}

}
