package Test;

import org.testng.annotations.Test;

public class GroupingExample {
//if contains multible methods like apple,vivo,nokia,moto;
	//n this i want to excute apple and moto:
	@Test(groups={"apple"})
	public void apple1() {
		System.out.println("apple1");
System.out.println("apple1");
	}@Test(groups= {"apple"})
	public void apple2() {
		System.out.println("apple2");

	}@Test(groups= {"vivo"})
	public void vivo1() {
		System.out.println("vivo1");

	}@Test(groups= {"vivo"})
	public void vivo2() {
		System.out.println("vivi2");

	}@Test(groups= {"moto"})
	public void moto1() {
		System.out.println("moto1");

	}@Test(groups= {"moto"})
	public void moto2() {
		
		System.out.println("moto2");
	}@Test(groups= {"nokia"})
	public void nokia1() {
		System.out.println("nokia1");

	}@Test(groups= {"nokia"})
	public void nokia2() {
		System.out.println("nokia2");

	
	}
}
