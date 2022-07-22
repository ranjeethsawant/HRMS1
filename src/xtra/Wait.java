package xtra;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
public class Wait {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("http://183.82.103.245/nareshit/login.php");  // 1. Open Application.
		  driver.findElement(By.name("txtUserName")).sendKeys("nareshit");   // 2. Enter Username.
		  driver.findElement(By.name("txtPassword")).sendKeys("nareshit");   // 3. Enter Password.
		  Thread.sleep(3000);
		 // Condition wait Until login page Btn to Available.            // Explicite Cond.
	
		                          
		 WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(3));                
		  wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
		  driver.findElement(By.name("Submit")).click();                                       // Click on login.
                                                                      
    // wait Until Employee Info : Page to be Available             // Emplicite Cond.
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  System.out.println("Login Completed");
		                                  
		  driver.findElement(By.linkText("Logout")).click();                                  // Logout
		  Thread.sleep(3000);
		  System.out.println("LogOut Completed");
		  driver.close();                                                                    // Close App.    
	}
    }

