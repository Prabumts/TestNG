package testngPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pom {
	WebDriver driver;

	@FindBy(id="email")
	
	public WebElement username;
	@FindBy(id="pass")
	public WebElement pwd;

	@FindBy(xpath="//button[@name='login']")
	public WebElement login;

	public Pom(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver, this);
}
	public static Properties property() throws IOException {
		Properties p=new Properties();
	
		FileInputStream input=new FileInputStream(System.getProperty("user.dir")+"\\data.properties");
		p.load(input);
		return p;

	}
	
	
}