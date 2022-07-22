package java_script_executer;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login_btn {

public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
Thread.sleep(1000);
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(1000);

//using javascriptExecuter to click on login btn

WebElement loginbtn = driver.findElement(By.name("Submit"));
JavascriptExecutor executor = (JavascriptExecutor)driver;
 executor.executeScript("arguments[0].click();", loginbtn); 
 Thread.sleep(4000);
 
//using javascriptExecuter to click on logout btn
 
WebElement logout = driver.findElement(By.linkText("Logout"));
JavascriptExecutor executor1 = (JavascriptExecutor)driver;
executor1.executeScript("arguments[0].click();", logout);
System.out.println("Logout completed");
driver.close();

	}
    }
