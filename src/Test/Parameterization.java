package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
@Test 
@Parameters("name")
	private void Address(String add) {
	
System.out.println("address"+add);
	}@Test
	@Parameters("id")
	private void id(int id1) {
	System.out.println("id"+id1);

	}@Test
	@Parameters("ph1")
	private void phno(long ph) {
		System.out.println("ph no:"+ph);

	}
}
