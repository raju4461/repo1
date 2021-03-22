package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class Shared {
	public static Properties readProp(String path) throws IOException{
		File f=new File(path);
		FileInputStream fs=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fs);
		return prop;
		
		
	}
	public static void click(WebElement element) {
		element.click();
		
	}

}
