package tc_05;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

import org.openqa.selenium.By;
 /* Test Steps :  
      1. Open Application.
      2. Enter URL.
      3. Click on Window 2 Button
      4. Click on Window 3 Button
      5. Navigate to 1st window from 3rd Window
      6. Close only current Browser or Close all Browsers.
  */
public class Window_Handles {
public static void main(String args[])throws Exception {
System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("file://S:/multiplewindows.html");
Thread.sleep(3000);

driver.findElement(By.id("btn1")).click();
Thread.sleep(3000);
driver.findElement(By.id("btn2")).click();
Thread.sleep(3000);
driver.findElement(By.id("btn3")).click();
Thread.sleep(3000);

ArrayList<String> windinfo= new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(windinfo.get(0));
driver.quit();
Thread.sleep(3000);
}
}





