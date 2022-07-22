package tc_02;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	public class TC_02 {
	public static void main(String args[]) throws Exception{
	    //Test Steps
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
	Select st = new Select(driver.findElement(By.name("loc_code")));
	List<WebElement> drpval = st.getOptions();
	
	for(WebElement val:drpval)                                          // For each loop
	{           
	    System.out.println(val.getText());
	}
      // Exit frome Frame 
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.linkText("Logout")).click();
	driver.quit();
	}
	}

