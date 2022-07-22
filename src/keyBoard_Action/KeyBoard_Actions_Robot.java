package keyBoard_Action;
import org.openqa.selenium.By;    
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class KeyBoard_Actions_Robot{
public static void main(String[] args) throws Exception {
/*    Test Steps 
     1. Open Application.
     2. Enter Username.
     3. Enter Password.
     4. Perform Tab activity from KeyBoard.  // Key Press and Key Release
     5. Perform Enter activity from KeyBoard.
     6. Click on Logout Option.
     7. Close Application.                      */
  System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.navigate().to("http://183.82.103.245/nareshit/login.php");  // 1. Open Application.
  driver.findElement(By.name("txtUserName")).sendKeys("nareshit");   // 2. Enter Username.
  driver.findElement(By.name("txtPassword")).sendKeys("nareshit");   // 3. Enter Password.
  Thread.sleep(3000);                                                // 4. Perform Tab activity from KeyBoard.
  Robot r = new Robot();                                             // Key Press and Key Release
  r.keyPress(KeyEvent.VK_TAB);          
  r.keyRelease(KeyEvent.VK_TAB); 
  System.out.println("TAB");
  Thread.sleep(4000);
  r.keyPress(KeyEvent.VK_ENTER);                                    // 5. Perform Enter activity from KeyBoard.
  r.keyRelease(KeyEvent.VK_ENTER);                                  //  Key Press and Key Release
  System.out.println("ENTER");
  Thread.sleep(2000);
  System.out.println("Login Completed");
  driver.findElement(By.linkText("Logout")).click();                // 6. Click on Logout Option.
  System.out.println("Logout Completed");
  driver.close();                                                  //  7. Close Application.      
  
}
}