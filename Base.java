package com.obsqura.TestNGSample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base {
	public WebDriver driver;
	@BeforeTest
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\TestNGSample\\src\\main\\java\\Resourse\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
        }
	public void browserClose() {
		driver.close();
	}
	@AfterTest
	public void browseQuit() {
		driver.quit();
	}
}
