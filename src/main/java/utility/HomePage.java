package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="") public WebElement menlink;
	@FindBy(xpath="") public WebElement crossbutton;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnCancel() {
		Shared.click(driver.findElement(By.xpath("")));
		Shared.click(crossbutton);
	}
	public menPage clickOnMenmenu() {
		Shared.click(driver.findElement(By.xpath("")));
		Shared.click(menlink);
		return new menPage(driver);
	
		
	}
}
	
