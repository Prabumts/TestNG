package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	@Test
	public void opengoogle() {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse-workspace\\SeleniumSetup\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	@Test public void openfacebook() {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse-workspace\\SeleniumSetup\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

	}
}
