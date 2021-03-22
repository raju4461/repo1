package maven;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Shared;

public class BaseTest {
	WebDriver driver;
	Properties prop;
	@BeforeClass
	public void configFile() throws IOException {
		prop=Shared.readProp(System.getProperty(System.getProperty("user.dir")+"/Users/imranmac/Desktop/eclipse-workspace/maven/target"));
	}
	@Before
	public void startBrowser() {
		String b=prop.getProperty("browser");
		if(b.equals("chrome")) {
			driver=new ChromeDriver();
			
		}else if(b.equals("firefox")) {
			driver=new FirefoxDriver();
			
		}
		driver.get("http://www.express.com");
		
		
		
	}

}