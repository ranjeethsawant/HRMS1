package login_logout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
// import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_001_Login_Logout {
public static void main(String[] args) throws Exception    // catch error
	// Test steps :
	/* 1.Launch Browser.
	   2.Enter URL.
	   3.Enter Username.
	   4.Enter Password.`
	   5.Click Login Button.
	   6.Click on Logout Option.
	   7.Close Application.
	 */
 {
    System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe"); // 1.Launch Browser.
                                                      //  file name path and include driver.exe
 //   System.setProperty("webdriver.gecko.driver", "S:\\Jar_Files\\geckodriver.exe");// firefox driver
	WebDriver driver = new ChromeDriver();
//  WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");                 // 2.Enter URL.
	Thread.sleep(3000);                   // wait statement: wait until the hole time is completed.
	System.out.println("Application Opened");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");                 // 3.Enter Username.
	Thread.sleep(3000);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");                 // 4.Enter Password.
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();                                   // 5.Click Login Button.
	System.out.println("Login Completed");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();                            // 6.Click on Logout Option.
	                          // start with <a means Anchor : linktext.  
	System.out.println("Logout Completed");
	Thread.sleep(3000);                               
	driver.close();                                                               // 7.Close Application.
	System.out.println("Close Application");
    }
	}


