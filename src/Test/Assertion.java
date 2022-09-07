package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	@Test
private void assertion() {
	String s1="Prabu";
Assert.assertEquals(s1, "Prabu");
Assert.assertTrue(true, "Prabu");
Assert.assertFalse(false);



}
	
}
