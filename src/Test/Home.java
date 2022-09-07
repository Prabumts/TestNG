package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Home  {
	WebDriver driver;
	long st;
	long totaltime;
	
	@BeforeSuite
public void browserOpen() {
long st=		System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-workspace\\Selenium AdvanceClass\\Driver\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
}@Test(priority=1)
public void opengoogle() {
driver.get("https://www.google.com");

}@Test(priority=2)

public void openyahoo() {
	driver.get("https://www.yahoo.com");
}@Test(priority=3)
public void openFb() {
	driver.get("https://www.facebook.com/");

}

@AfterSuite
private void browserClose() {
	
driver.quit();
long ct = System.currentTimeMillis();
totaltime=ct-st;
System.out.println("totaltime");
}

}
