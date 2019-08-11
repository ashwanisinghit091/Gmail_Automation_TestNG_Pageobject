package Gmail;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


public class Base {

	
	
	
	static  Properties pr;
	static WebDriver Driver;
	@BeforeMethod
	public static void invoke_browser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	 Driver =new ChromeDriver();
	  pr=new Properties();
		FileInputStream fs=new FileInputStream("D:\\workspace11\\Gmail_Automation_TestNG_Pageobject\\src\\test\\java\\Gmail\\Credentials.properties");
		pr.load(fs);
		Driver.get(pr.getProperty("URL"));
		Driver.manage().window().maximize();

		Driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		Driver.findElement(By.id("identifierId")).sendKeys(pr.getProperty("Loginusername"));//put username for login
		
		Driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		Driver.findElement(By.name("password")).sendKeys(pr.getProperty("password"));//put password for login
		Driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
	}
	
	@AfterMethod
	public static void j() throws InterruptedException {

		Driver.close();
	
	
	}
	
}
