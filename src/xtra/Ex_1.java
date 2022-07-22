package xtra;
import org.openqa.selenium.chrome.ChromeDriver;   
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Ex_1 {
  
	public static void main(String[] args)throws Exception {
 System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.navigate().to("http://183.82.103.245/nareshit/login.php");
 
 // Login 
 System.out.println(driver.getTitle());
 
 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
 driver.findElement(By.name("txtPassword")).sendKeys("nareshit"); 
 Thread.sleep(3000);
 driver.findElement(By.name("Submit")).click();
 Thread.sleep(3000);
 
 System.out.println(driver.getTitle());
 
 // Mouse Over
  Actions ac = new Actions(driver);
 ac.moveToElement(driver.findElement(By.linkText("Admin"))).perform();   // click Admin
 System.out.println("click on Admin");
 Thread.sleep(3000);
 
//Sub-menu
 ac.moveToElement(driver.findElement(By.linkText("Qualification"))).perform();
 System.out.println("click Qualification");
 Thread.sleep(3000); 
 
//Sub-menu
driver.findElement(By.linkText("Education")).click();
System.out.println("click Education");
Thread.sleep(3000);     
  
//Enter into frame
driver.switchTo().frame("rightMenu");

// dropdown
Select st =new Select(driver.findElement(By.name("loc_code")));
//st.selectByVisibleText("ID");
//Thread.sleep(3000);
//st.selectByIndex(1);
//Thread.sleep(3000);
st.selectByValue("0");
Thread.sleep(3000); 

driver.findElement(By.name("loc_name")).sendKeys("EDU001");   // txtbox
driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input[2]")).click(); // search button
Thread.sleep(3000);
driver.findElement(By.name("chkLocID[]")).click();
Thread.sleep(3000);

// Exit from fram
driver.switchTo().defaultContent();
Thread.sleep(3000);
  
driver.findElement(By.linkText("Logout")).click();   
Thread.sleep(3000);
System.out.println("Logout App");
driver.close();
	}
	}