package Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("over th test");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("ready to start");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("failure percent");
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("on test failure");
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("on skippd");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("test started");
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
System.out.println("test complete");
		
	}

}
