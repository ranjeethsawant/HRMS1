package tc_05;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import org.openqa.selenium.Alert;

public class TC_005 {
static	String un = "nareshit" ;
static	String pw = "nareshit" ;
public static void main(String args[]) throws Exception {
System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println("Open Application");

//**** Title
System.out.println(driver.getTitle());

driver.findElement(By.name("txtUserName")).sendKeys(un);
 driver.findElement(By.name("txtPassword")).sendKeys(pw);
 
 //****JSE
 WebElement loginbtn = driver.findElement(By.name("Submit"));
 JavascriptExecutor execute = (JavascriptExecutor)driver;
 execute.executeScript("arguments[0].click();",loginbtn);
 
 
 /*
driver.findElement(By.name("Submit")).click();

//****Alert
Alert alrt = driver.switchTo().alert();
System.out.println(alrt.getText());

Thread.sleep(3000);
alrt.accept();
driver.findElement(By.name("txtPassword")).sendKeys(pw);
//Thread.sleep(10000);

//******* Explicitely Wait
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
driver.findElement(By.name("Submit")).click();
*/
System.out.println("Login into Application");
System.out.println(driver.getTitle());

/*       //**** Click on PIM Linktext
 driver.findElement(By.linkText("PIM")).click();
 System.out.println("PIM open");
 
 
 //******* Enter into Frame
 driver.switchTo().frame("rightMenu");
 System.out.println("Enter into frame");
 Thread.sleep(3000);
 
//*** Dropdown
Select st = new Select(driver.findElement(By.name("loc_code")));
Thread.sleep(3000);
//st.selectByVisibleText("Emp. ID");
st.selectByIndex(0);
st.selectByValue("0");
System.out.println("Select Employee ID from DropDown ");
Thread.sleep(3000);   

//** Textbox
driver.findElement(By.name("loc_name")).sendKeys("0755");

//*** Search btn
driver.findElement(By.xpath("//input[@type='button'][@value='Search']")).click();

*/
//******* Enter into Frame
driver.switchTo().frame("rightMenu");
System.out.println("Enter into frame");
Thread.sleep(3000);

//***click on Add btn
driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
System.out.println("click on add btn");
Thread.sleep(3000);

driver.findElement(By.name("txtEmpLastName")).sendKeys("Sawant");
System.out.println("Enter last name");
driver.findElement(By.name("txtEmpFirstName")).sendKeys("Ranjeet");
System.out.println("first name");

//****** File upload
WebElement uploadfile = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
uploadfile.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\2022-07-16.png");
System.out.println("upload file");
driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/div[2]/input[1]")).click();
Thread.sleep(3000); 
 //**** Exit from frame
 driver.switchTo().defaultContent();
 System.out.println("Exit from frame");
 
 driver.findElement(By.linkText("Logout")).click();
//Thread.sleep(3000); 

//*** Emplicitely wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
System.out.println("Logout Application");
driver.close();
System.out.println("colse Browser");

}
}
