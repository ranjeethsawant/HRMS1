package java_script_executer;
    import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class JSE {
	    public static void main(String args[]) throws Exception{
	        System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();
	           //test casse steps
	        driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	        driver.manage().window().maximize();
	        
	       //******** Login btn
	        driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	        driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	        Thread.sleep(5000);
	       WebElement loginbtn  = driver.findElement(By.name("Submit"));
	        JavascriptExecutor executor = (JavascriptExecutor)driver;
	        executor.executeScript("arguments[0].click();", loginbtn);
	        
	        //*** logout
	       WebElement logoutbtn =  driver.findElement(By.linkText("Logout"));
	       JavascriptExecutor execute = (JavascriptExecutor)driver;
	       execute.executeScript("arguments[0].click()",logoutbtn);        
	       
	       
	        Thread.sleep(3000);
	        
	       driver.close();
	        }
	}

