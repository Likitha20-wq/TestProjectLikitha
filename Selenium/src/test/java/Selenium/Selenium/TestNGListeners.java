package Selenium.Selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
	 @Override		
	    public void onFinish(ITestContext result) {					
	        // TODO Auto-generated method stub	
		 System.out.println("Test Finish" +result.getName());
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext result) {	
	    	
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult result) {					
	        // TODO Auto-generated method stub	
	    	System.out.println("Test Failed" +result.getName());
	        		
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult result) {					
	        // TODO Auto-generated method stub	
	    	System.out.println("Test Skipped" +result.getName());
	        		
	    }		

	    @Override		
	    public void onTestStart(ITestResult result) {					
	        // TODO Auto-generated method stub		
	    	System.out.println("Test Started" +result.getName());
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult result) {					
	        // TODO Auto-generated method stub	
	    	System.out.println("Test Success" +result.getName());
	        		
	    }		
}
