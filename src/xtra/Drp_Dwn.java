package xtra;
import org.openqa.selenium.By;    
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Drp_Dwn {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("http://183.82.103.245/nareshit/login.php");  // 1. Open Application.
		  driver.findElement(By.name("txtUserName")).sendKeys("nareshit");   // 2. Enter Username.
		  driver.findElement(By.name("txtPassword")).sendKeys("nareshit");   // 3. Enter Password.
		  Thread.sleep(3000);
		  driver.findElement(By.name("Submit")).click();
		  
		  // Enter into Frame
		   driver.switchTo().frame("rightMenu");
		   System.out.println("inter into frame");
		   
		 Select st = new Select(driver.findElement(By.name("loc_code")));
		   st.selectByVisibleText("Emp. ID");
		//   st.selectByIndex(1);
		 //  st.selectByValue("0");
          Thread.sleep(3000);
          driver.close();
          
	}

}
