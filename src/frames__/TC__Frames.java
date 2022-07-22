package frames__;
import org.openqa.selenium.By;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class TC__Frames {
	public static void main(String args[]) throws Exception {
		
	
	/*
	 Test Steps
	   1. Open Application
	   2. Login into Application
	   3. Click on Add Button
	   4. Enter First Name
	   5. Enter Last Name
	   6. Click on Save Button
	   7. Click on Logout Button
	   8. Close Application
	   
	 */
   System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.navigate().to("http://183.82.103.245/nareshit/login.php");             // 1. Open Application
   driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
   driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
   driver.findElement(By.name("Submit")).click();                                // 2. Login into Application
   System.out.println("Login into Application");
   Thread.sleep(3000);
   
// Enter into Frame :
   
   driver.switchTo().frame("rightMenu");
   
   driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();  // 3. Click on Add Button
   System.out.println("Add New Employee");
   Thread.sleep(3000);
  
  driver.findElement(By.name("txtEmpLastName")).sendKeys("Saw");                   // 4. Enter Last Name
  System.out.println("Enter Last Name");
  Thread.sleep(2000);
  driver.findElement(By.name("txtEmpFirstName")).sendKeys("Ranjeet");              //5. Enter First Name
 System.out.println("Enter First Name");
  Thread.sleep(2000);
  driver.findElement(By.id("btnEdit")).click();                                   //  6. Click on Save Button
  System.out.println("Added New Employee");
  Thread.sleep(3000);
  
  // Exit from Frame :
  
  driver.switchTo().defaultContent();
  
  driver.findElement(By.linkText("Logout")).click();                           //  7. Click on Logout Button
  System.out.println("Logout Completed");
  Thread.sleep(3000);
  driver.close();                                                              //  8. Close Application
}
}