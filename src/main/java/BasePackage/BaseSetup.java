package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseSetup {
	WebDriver driver;
	
	public void setUpDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
		if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
	}
	
	//@Test
	public void readDataFromPropertyFile() throws IOException {
		Properties prope=new Properties();
		try {
			FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Ramanjaneyulu\\eclipse-workspace\\SeleniumAndCucumber\\src\\test\\resources\\config.properties");
			prope.load(fileInputStream);
			String user=prope.getProperty("user");
			System.out.println(user);
			
		
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
	}
	@Test
	public void writeDataToPropertyFile() throws IOException {
		Properties prop=new Properties();
		FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\Ramanjaneyulu\\eclipse-workspace\\SeleniumAndCucumber\\src\\test\\resources\\config.properties");
		prop.setProperty("url", "https://google.com");
		prop.setProperty("Environment", "System Test");
		prop.setProperty("endpoint", "/product/1");
		prop.setProperty("user", "Raj");
		prop.setProperty("password", "pwd");
		prop.store(fileOutputStream, "Stored valuse");
		prop.setProperty("url","https://fake.api.com/product");
		System.out.println(prop.getProperty("url"));
		
	}
	
}
