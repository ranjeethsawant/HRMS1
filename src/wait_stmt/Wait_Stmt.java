package wait_stmt;
import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Stmt {
public static void main(String args[]) throws Exception {
 System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.navigate().to("http://183.82.103.245/nareshit/login.php");
 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");                      // username
 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");                      // password
 
 // Condition wait Until login page Btn to Available.            // Explicite Cond.
 
 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));                
 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
 driver.findElement(By.name("Submit")).click();                                       // Click on login.
                                                                       
 // wait Until Employee Imfo : Page to be Available             // Emplicite Cond.
 
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
 System.out.println("Login Completed");
 driver.findElement(By.linkText("Logout")).click();                                  // Logout
 Thread.sleep(3000);
 System.out.println("LogOut Completed");
 driver.close();                                                                    // Close App.                    
}
}