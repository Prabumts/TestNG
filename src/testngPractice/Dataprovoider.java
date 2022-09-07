package testngPractice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dataprovoider {
	WebDriver driver;
	@BeforeClass
private void tc_001() {
	System.setProperty("webdriver.chrome.driver", "F:\\eclipse-workspace\\Selenium AdvanceClass\\Driver\\chromedriver.exe");

	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
@Test(priority=1,enabled=false)
public void opengoogle() {
driver.get("https://www.google.com");

}@Test(priority=2,enabled=false)

public void openyahoo() {
	driver.get("https://www.yahoo.com");
}



@Test(priority=3)
public void openFb() throws IOException {
	Pom o=new Pom(driver);
	driver.get(Pom.property().getProperty("url"));
	o.username.sendKeys(Pom.property().getProperty("username"));
	o.pwd.sendKeys(Pom.property().getProperty("pwd"));
	o.login.click();

}
@AfterClass
private void afterclass() {
	driver.quit();

}

}


