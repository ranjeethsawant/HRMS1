package keyBoard_Action;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class Webdriver_Keys {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","S://Jar_Files//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.google.co.in/");
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	driver.close();
	}
    }
