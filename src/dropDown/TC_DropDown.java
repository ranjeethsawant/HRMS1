package dropDown;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
// Test Steps : 
/*  1.Open Application.
    2.login into Application.
    3.Select Employee ID from search by Dropdown.
    4.Enter Eployee ID in search for txt-Box.
    5.Click on Search Button.
    6.Click on CheckBox.
    7.Click on Delete Button.
    8.Click on Logout Option.
    9.Close Application.
 
 */
public class TC_DropDown {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	driver.switchTo().frame("rightMenu");
	Select st =new Select(driver.findElement(By.name("loc_code")));
	st.selectByVisibleText("Emp. ID");
	driver.findElement(By.name("loc_name")).sendKeys("0450");
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	driver.findElement(By.name("chkLocID[]")).click();
	driver.findElement(By.xpath("//input[@value='Delete']")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.close();
	

	}

}
