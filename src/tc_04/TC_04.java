package tc_04;
    import java.time.Duration;
	import org.openqa.selenium.WebDriver;    
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.By;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
	public class TC_04 {
	  
		public static void main(String[] args) throws Exception  {
	   System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			Thread.sleep(3000);
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			Thread.sleep(3000);
			// Explicite wait
			
			WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(3));
			wt.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
			driver.findElement(By.name("Submit")).click();
			
			// Emplicitely wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			System.out.println("Login Completed");
			Thread.sleep(3000);
			
			// Enter into frame
			driver.switchTo().frame("rightMenu");   
			Select st = new Select(driver.findElement(By.name("loc_code")));
			st.selectByVisibleText("Emp. ID");
			Thread.sleep(3000);
			System.out.println("Emp_id page open");
			driver.findElement(By.name("loc_name")).sendKeys("0563");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr[1]/td[1]/input")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[2]")).click();
			Thread.sleep(3000);
			//Exit into frame
			driver.switchTo().defaultContent();
			driver.findElement(By.linkText("Logout")).click();                     
			System.out.println("Logout Completed");
			Thread.sleep(3000);
	        driver.close();                                            
			

}

		
}