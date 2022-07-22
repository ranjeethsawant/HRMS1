package tc_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TC_KeyBoard_Action {
	static	String un = "nareshit" ;
	static	String pw = "nareshit" ;
	public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Open Application");

	//**** Title
	System.out.println(driver.getTitle());

	driver.findElement(By.name("txtUserName")).sendKeys(un);
	driver.findElement(By.name("txtPassword")).sendKeys(pw);
//  driver.findElement(By.name("Submit")).click();
    
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB); 
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	driver.close();
	}
    }
