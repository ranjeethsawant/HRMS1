package alert;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class TC_Alert {
public static void main(String[] args)  throws Exception {
/* Test Steps :
	 1. Open Application.
	 2. Enter Username.
	 3. Click on Login Buttn.
	 4. Retrive text from alert.
	 5. click on OK Button on Alert.   // OK : accept(); or Cancle : dismiss();
	 6. Enter Password.
	 7. Click on Login Button. 
	 8. Click on Logout Button.
	 9. Close Application. 
	                                 */
	System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");  
	WebDriver driver = new ChromeDriver(); 
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");        // 1. Open Application.
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");         // 2. Enter Username.
	driver.findElement(By.name("Submit")).click();                           // 3. Click on Login Buttn.
	Thread.sleep(3000);                                                      //	4. Retrive text from alert.

	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();                                                             //  5. click on OK Button on Alert.
	Thread.sleep(4000);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");        // 	6. Enter Password. 
	driver.findElement(By.name("Submit")).click();                          //  7. Click on Login Button. 
	Thread.sleep(3000);                                                   
	driver.findElement(By.linkText("Logout")).click();                      //  8. Click on Logout Button.
	System.out.println("Logout Completed");
	driver.close();	                                                        //  9. Close Application.
}
}
