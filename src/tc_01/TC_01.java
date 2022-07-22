package tc_01;
import org.openqa.selenium.By;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class TC_01 {

	/*
	    Test Steps
	      1. Open Application
	      2. Login into Application
	      3. Click on Alternative checkbox upto 10 Records
	      4. Click on Logout
	      5. Close Application
	 */

public static void main(String args[]) throws Exception {
 System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();	
 
 driver.navigate().to("http://183.82.103.245/nareshit/login.php");
 System.out.println("Open Application");
 
 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
 driver.findElement(By.name("Submit")).click();
 Thread.sleep(3000);
 System.out.println("Login Successfull");
 
 // Enter into frame
 
 driver.switchTo().frame("rightMenu");
 Thread.sleep(3000);
 
 for(int i = 1; i<10; i=i+2) 
 {
                                // Copy full X-path 2nd checkbox change tr
	 driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr["+ i +"]/td[1]/input")).click();
	 System.out.println("clicked on checkbox of " + i);
	 Thread.sleep(2000);
     }
 Thread.sleep(3000);
 
 // Exit from frame
 
 driver.switchTo().defaultContent();
 driver.findElement(By.linkText("Logout"));
 System.out.println("Logout Successfull");
driver.close();
System.out.println("Close the Application");
 } 
}
     

 