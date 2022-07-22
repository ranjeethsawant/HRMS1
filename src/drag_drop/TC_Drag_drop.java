package drag_drop;
                                               // Add testNg jar file.
import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;
public class TC_Drag_drop {

public static void main(String[] args) throws Exception{
  System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");  // file & driver loc
   WebDriver driver = new ChromeDriver();
 
  driver.navigate().to("https://jqueryui.com/droppable/");             // url
  System.out.println("Open Application");
  Thread.sleep(3000);
  
	//verify title --                                                  cond-fail-stop exe
	    // Assert stmt cond true cont.exe. stmt false stop exe.
  assertEquals(driver.getTitle(),"Droppable | jQuery UI");
    System.out.println("title matched");
    
    // inter into frame
    
    driver.switchTo().frame(0);
    Actions ac = new Actions(driver);
    ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
    Thread.sleep(4000);
    System.out.println("Drag&drop");
    
    // Exit into frame
    
    driver.switchTo().defaultContent();
    driver.close();
	   
}
}
	

