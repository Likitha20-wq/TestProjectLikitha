package Pages;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test; 

public class FirstTestPage {
	  
 WebDriver driver; 
	  
	 public FirstTestPage(WebDriver driver) { 
	       this.driver = driver; 
	    } 
	  
	    // Using FindBy for locating elements 
	 @FindBy(how = How.XPATH, using =  "//a[text()='Edit']")
	 WebElement editButton; 
	  
	 @FindBy(how = How.XPATH, using =  "//input[@id='fullName']")
	 WebElement fullName;
	 
	 @FindBy(how = How.XPATH, using =  "//input[@id='join']")
	 WebElement appendtext;
	
	 @FindBy(how = How.XPATH, using =  "//input[@id='getMe']")
	 WebElement textTab;

	 @FindBy(how = How.XPATH, using =  "//input[@id='noEdit']")
	 WebElement fieldenabled;
	 
	 @FindBy(how = How.XPATH, using =  "//a[text()='Click']")
	 WebElement buttonclick;
	 
	 
	 @FindBy(how = How.XPATH, using =  "//button[@id='home']")
	 WebElement homeButton;
	 
	 @FindBy(how = How.XPATH, using =  "//button[text()='Find Location']")
	 WebElement location;
	 
	 @FindBy(how = How.XPATH, using =  "//button[@id='color']")
	 WebElement buttoncolor;
	 
	 @FindBy(how = How.XPATH, using =  "//button[@id='property']")
	 WebElement buttonsize;
	 
	 @FindBy(how = How.XPATH, using =  "//button[@id='isDisabled']")
	 WebElement buttonenabled;
	 
	 @FindBy(how = How.XPATH, using =  "//a[text()='Drop-Down']")
	 WebElement select1;
	 
	 @FindBy(how = How.CSS, using = "#fruits")
	 WebElement fruitselect;
	 
	 @FindBy(how = How.CSS, using =  "#superheros")
	 WebElement superhero;
	 
	 @FindBy(how = How.CSS, using =  "#lang")
	 WebElement lang;
	 
	 @FindBy(how = How.XPATH, using =  "//a[text()='Dialog']")
	 WebElement dialog;
	 
	 @FindBy(how = How.XPATH, using =  "//button[text()='Simple Alert']")
	 WebElement salert;
	 
	 @FindBy(how = How.XPATH, using =  "//button[text()='Confirm Alert']")
	 WebElement dalert;
	 
	 @FindBy(how = How.XPATH, using =  "//button[text()='Prompt Alert']")
	 WebElement palert;
	 
	 @FindBy(how = How.XPATH, using =  "//button[text()='Modern Alert']")
	 WebElement malert;
	 
	 @FindBy(how = How.XPATH, using =  "//p[@class='title']")
	 WebElement sweet;
	 
	 @FindBy(how = How.XPATH, using =  "//a[text()='Inner HTML']")
	 WebElement frame;
	 
	 @FindBy(how = How.XPATH, using =  "//input[@name='fname']")
	 WebElement fname;
	 
	 @FindBy(how = How.XPATH, using =  "//input[@name='lname']")
	 WebElement lname;
	 
	 @FindBy(how = How.XPATH, using =  "//input[@name='email']")
	 WebElement email;
	 

	 @FindBy(how = How.XPATH, using =  "//a[text()='Toggle']")
	 WebElement radbutton;
	 
	 @FindBy(how = How.XPATH, using =  "//input[@id='yes']")
	 WebElement yes;
	 
	 @FindBy(how = How.XPATH, using =  "//input[@id='notfoo']")
	 WebElement radselect;
	
	 @FindBy(how = How.XPATH, using =  "//input[@id='maybe']")
	 WebElement radenable;
	 
	 @FindBy(how = How.XPATH, using =  "//a[text()='Tabs']")
	 WebElement winTab;
	 
	 @FindBy(how = How.XPATH, using =  "//button[text()='Open Home Page']")
	 WebElement hpage;
	 
	 @FindBy(how = How.XPATH, using =  "//button[text()='Muiltiple windows']")
	 WebElement mpage;
	 
	 @FindBy(how = How.XPATH, using =  "//a[text()='Find Elements']")
	 WebElement elebutton;
	 
	 @FindBy(how = How.XPATH, using =  "//input[@name='username']")
	 WebElement eletext;
	 
	 
	 
	 
	 
	 
	 
	  public void clickOneditButton() { 
	        editButton.click(); 
	            
	      
	 } 
	 public void setfullname(String fullname) { 
	        fullName.sendKeys(fullname); 
	            
	      
	 } 
	 public void setappendtext(String appendText) {
		 appendtext.sendKeys(appendText);
		
		 
	 }
	   
	 public void keyboardTab() { 
	        textTab.sendKeys(Keys.TAB); 
	        String text1 = textTab.getAttribute("Koushik");
	        System.out.println(text1);
			textTab.clear();
	            
	      
	 } 
	 public void textfield() {
		 boolean isEdit =fieldenabled.isEnabled();
		 System.out.println(isEdit);
		 
	 }
	 public void clickbutton1() {
		 buttonclick.click();
	 }
	 public void clickOnhomeButton() { 
	        homeButton.click(); 
	            
	      
	 } 
	 public void findlocation() {
		Point point= location.getLocation();
		System.out.println(point);
		int x1=point.getX();
		System.out.println(x1);
		int y1=point.getY();
		System.out.println(y1);
		
	 }
	 
	 public void buttonColor() {
			String value1= buttoncolor.getCssValue("background-color");
			System.out.println("Button color is "+value1);
		 }
	 public void buttonsize1() {
			Dimension value2= buttonsize.getSize();
			System.out.println("Button size is"+value2);
		 }
	 public void buttonenabled1() {
		 boolean benabled =buttonenabled.isEnabled();
		 System.out.println(benabled);
		 
	 }
	 public void dropdownselect() {
		 select1.click();
		 
	 }
	 
	 public void fruitselect1() {
		 Select se= new Select(fruitselect);
		 se.selectByVisibleText("Mango");
		 
	 }
	 
	 public void superhero1() {
		 Select se1= new Select(superhero);
		 boolean supermul=se1.isMultiple();
		 System.out.println("Is superhero allows multiple" +supermul);
		 se1.selectByVisibleText("Aquaman");
		 se1.selectByIndex(6);
		 se1.selectByValue("sg");
		 
		 
	 }
	 public void lang1() {
		 Select se2= new Select(lang);
		 List<WebElement> options=se2.getOptions();
		 System.out.println("List of options in language dropdown are :");
		 for (WebElement option : options) {
		 System.out.println(option.getText());
		 }
		 WebElement option = se2.getFirstSelectedOption();
		 System.out.println("First selected option is" +option.getText());
		 
		 
		 
	 }
	 public void dialog1() {
		 dialog.click();
		
	 }
	 public void salert1() throws InterruptedException {
		 salert.click();;
		 Alert alert = driver.switchTo().alert();
		 Thread.sleep(500);
		 alert.accept();
		 dalert.click();
		 Thread.sleep(500);
		 alert.dismiss();
		 palert.click();
		 Alert promptAlert  = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent());
		 promptAlert.sendKeys("Likitha");
		 Thread.sleep(500);
		 System.out.println("Value in prompt alert is" +alert.getText());
		 alert.accept();
		 malert.click();
		 System.out.println("Modern alert text is:" + sweet.getText());
		 
		 
	 }
	 @Test(groups = { "frame" })	
	 public void frame1() throws InterruptedException {
		 frame.click();
		 //driver.get("https://letcode.in/frame");
		 WebElement frame2= driver.findElement(By.id("firstFr"));
		 driver.switchTo().frame(frame2);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		 WebElement fname1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='fname']")));
		 fname1.sendKeys("Likitha");
		 driver.switchTo().frame(1);
		 WebElement email1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		 email1.sendKeys("likitha@gmail.com");
		 driver.switchTo().parentFrame();
		 lname.sendKeys("Veerasekar");
		 driver.switchTo().defaultContent();
		 
		 
		 
		
	 }
	 public void radbutton1() {
		 radbutton.click();
		 yes.click();
		 Boolean rs= radselect.isSelected();
		 System.out.println("Button is selected" +rs);
		 Boolean re = radenable.isEnabled();
		 System.out.println("Button is enabled" +re);
		
	 }
	 public void winTab1() {
		 winTab.click();
		 hpage.click();
		 String Parent_id = driver.getWindowHandle(); 
	     System.out.println(Parent_id); 
		 Set<String> windowhandles = driver.getWindowHandles();
		 System.out.println(windowhandles);
		 List<String> list= new ArrayList<String>(windowhandles);
		 driver.switchTo().window(list.get(1));
		 System.out.println(driver.getCurrentUrl());
		 driver.switchTo().window(list.get(0));
		 driver.close();
		 Set<String> windowhandles2 = driver.getWindowHandles();
		 list.clear();
		 list.addAll(windowhandles2);
		 driver.switchTo().window(list.get(0));
		 winTab.click();
		 mpage.click();
		 Set<String> s = driver.getWindowHandles();
	     Iterator <String> iterator = s.iterator();
	     while (iterator.hasNext()) {
	     String ChildWindow = iterator.next();
	     if (!Parent_id.equalsIgnoreCase(ChildWindow)) {
             driver.switchTo().window(ChildWindow);
             String text = driver.getTitle();
             System.out.println("Heading of child window is " +text);
           
	 
	 
	     } 
	     }
		 driver.switchTo().window(list.get(0));
		 
		 
	 }
	 public void elebutton1() {
		 driver.manage().window().minimize();
		 driver.get("https://letcode.in/elements");
		 driver.manage().window().maximize();
		 eletext.sendKeys("Likitha20-wq",Keys.ENTER);
		 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		 List<WebElement> elements1 =driver.findElements(By.xpath("//div[@class='card-content']"));
		 for (WebElement span : elements1) {
			 String ele = span.getText();
			 System.out.println(ele);
			 
			 
		 }
		 WebElement section= driver.findElement(By.xpath("//figure[@class='image is-128x128']"));
		 WebElement image= section.findElement(By.xpath("//img[@class='is-rounded']"));
		 boolean imagePresent = image.isDisplayed();
		// assertTrue(imagePresent, "No image present");
		 System.out.println("Image present" +imagePresent);
	 }
	 
	 
		   
	   
} 
	
