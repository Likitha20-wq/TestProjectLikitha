package Selenium.Selenium;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.*;
import org.testng.annotations.Listeners;

@Test
@Listeners(listeners.TestNGListeners.class)
public class BrowserTest {
	@Parameters({"MyName"})
	@Test(groups= {"sanity"})
	public void testCase1(String Name) {
	   System.out.println("Name is "+Name);
	   //int i= 1/0;
	}
	@Test(groups= {"smoke"})
	public void testCase2() {
	   System.out.println("This is Test Case 2");
	   //throw new SkipException("Test case skipped");
	}
	@BeforeMethod()
	public void beforeMethod() {
	   System.out.println("This will execute before every Test Method");
	}
	@AfterMethod
	public void afterMethod() {
	   System.out.println("This will execute after every Test Method");
	}
	@BeforeClass
	public void beforeClass() {
	   System.out.println("This will execute before the Class");
	}
	@AfterClass
	public void afterClass() {
	   System.out.println("This will execute after the Class");
	}
	@BeforeTest
	public void beforeTest() {
	   System.out.println("This will execute before the First Test");
	}
	@AfterTest
	public void afterTest() {
	   System.out.println("This will execute after the Last Test");
	}
	@BeforeSuite
	public void beforeSuite() {
	   System.out.println("This will execute before the Test Suite");
	}
	@AfterSuite
	public void afterSuite() {
	   System.out.println("This will execute after the Test Suite");
	}
	}