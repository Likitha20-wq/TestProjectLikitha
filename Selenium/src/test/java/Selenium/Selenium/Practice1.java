package Selenium.Selenium;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		//WebElement Admin;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		driver.findElement(By.xpath("//div[text()='Admin']")).click();
		try {
		driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']//following::input[@class='oxd-input oxd-input--active']")).sendKeys("Admin");
		WebElement userrole=driver.findElement(By.xpath("//label[text()='User Role']//following::div[@class='oxd-select-text-input']"));
		Select oSelect=new Select(userrole);
		oSelect.selectByVisibleText("Admin");
		}
		catch(Exception e) {
			System.out.println("Exception is"+e);
			
		}
	
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Rohit R Sharma");
		WebElement status=driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']//following::div[@class='oxd-select-text-input']"));
		Select oSelect1=new Select(status);
		oSelect1.selectByVisibleText("Enabled");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		

	}

}