package LikithaProject.LikithaProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.FirstTestPage;
public class FirstTestBase {
	public static WebDriver driver = null; 
@BeforeTest
 public void LaunchBrowser() {
	
	driver= new ChromeDriver();
	driver.get("https://letcode.in/test");
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	driver.manage().window().maximize();
}
  
  @AfterTest
  
  public void CloseBrowser() {
	  
	  //driver.close();
	 // driver.quit();
	  
  }
  
 }
