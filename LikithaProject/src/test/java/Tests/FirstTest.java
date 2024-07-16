package Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory; 
import org.testng.annotations.Test; 
import Pages.FirstTestPage; 
import LikithaProject.LikithaProject.FirstTestBase; 	 
public class FirstTest extends FirstTestBase { 
    
    @Test
public void init() throws Exception { 	    
	  
	    
	          
FirstTestPage inputpage =  PageFactory.initElements(driver, FirstTestPage.class); 
	      
inputpage.clickOneditButton();
Thread.sleep(1000);
inputpage.setfullname("Likitha");
inputpage.setappendtext("  at Selenium");
inputpage.keyboardTab();
inputpage.textfield();
driver.navigate().back();
inputpage. clickbutton1();
Thread.sleep(500);
inputpage.clickOnhomeButton();
driver.navigate().back();
inputpage.findlocation();
inputpage.buttonColor();
inputpage.buttonsize1();
inputpage.buttonenabled1();
driver.navigate().back();
inputpage.dropdownselect();
Thread.sleep(500);
inputpage.fruitselect1();
inputpage.superhero1();
inputpage.lang1();
driver.navigate().back();
inputpage.dialog1();
inputpage.salert1();
driver.navigate().back();
inputpage.frame1();
driver.navigate().back();
inputpage.radbutton1();
driver.navigate().back();
inputpage.winTab1();
driver.navigate().back();
inputpage.elebutton1();




	         
  }
}
