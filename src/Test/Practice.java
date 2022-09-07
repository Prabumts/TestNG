package Test;

import org.testng.annotations.Test;

public class Practice {
	
	@Test(priority=1,enabled=true)
	public void username() {
long starttime=		System.currentTimeMillis();
		System.out.println("Enter Username");

	}
	@Test(priority=2,dependsOnMethods="username")
	public void password() {
		System.out.println("Enter password");// TODO Auto-generated method stub

	}
	@Test(priority=3,dependsOnMethods="password")
	public void login() {
		System.out.println("Enter login");// TODO Auto-generated method stub

	}

}

	




		


