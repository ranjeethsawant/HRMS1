package xtra;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
  import org.openqa.selenium.WebElement;
  public class TC_Drpdwn {
  public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		
		System.out.println(driver.getTitle());                               // Retrive title
		Thread.sleep(3000);
		
		//Enter into Frame
		
	    driver.switchTo().frame("rightMenu");
		
	    // Perform DropDowm Activity
	    
	    Select st = new Select(driver.findElement(By.name("loc_code")));
        List<WebElement>drpval = st.getOptions();
        
        for(WebElement value : drpval) {
        	System.out.println(value.getText());
        	Thread.sleep(3000);
        }
	    // Exit from frame
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
        
  }
  }

