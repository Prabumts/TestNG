package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ListOFAnnotationsin {

	
	
	
	@Test(enabled=false,groups= {"method"},dependsOnMethods="method")
	@AfterClass
	@AfterMethod
	@DataProvider
	@Parameters(value="werre")
	
	private void method() {
	// TODO Auto-generated method stub

}
}
