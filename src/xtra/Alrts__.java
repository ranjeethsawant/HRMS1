package xtra;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
public class Alrts__ {
	public static void main(String[] args) throws Exception {	
	 System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.navigate().to("http://183.82.103.245/nareshit/login.php");            // 1. Open Application.
	 System.out.println(driver.getTitle());                               // Title
	 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");             // 2. Enter UserName.
	 driver.findElement(By.name("Submit")).click();                              //  3. Click on Login Button.
	 Thread.sleep(4000);
	 
	 Alert alrt = driver.switchTo().alert();
	 System.out.println(alrt.getText());
	 Thread.sleep(3000);
	 alrt.accept();
	 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");           //  6. Enter Password.
	 System.out.println("Enter Password");
	 driver.findElement(By.name("Submit")).click();                             //  7. Click on Login Button.
	 System.out.println("Login Completed");
	 Thread.sleep(4000);
	 driver.findElement(By.linkText("Logout")).click();                         // 8. Click on Logout Option.
	 System.out.println("Logout Completed");
	 driver.close();
}
}