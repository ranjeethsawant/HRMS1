package keyBoard_Action;
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class RobotActivity {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "S://Jar_Files//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(4000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	System.out.println("TAB");
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	System.out.println("ENTER");
	Thread.sleep(3000);
	System.out.println("login Completed");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout Completed");
	driver.close();
	

	}

}
