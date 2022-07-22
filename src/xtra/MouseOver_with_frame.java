package xtra;
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class MouseOver_with_frame {

public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("App Open");
	System.out.println("Title :" + driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	System.out.println("Enter Name");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");	
	System.out.println("Enter Password");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login Completed");
	Thread.sleep(3000);
	System.out.println("Title :" + driver.getTitle()); 
	
	// Mouse Over
	System.out.println("Open PIM ");
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();	
	System.out.println("Move on PIM ");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Add Employee")).click();
	System.out.println("Click Add Employee");
	Thread.sleep(3000);
	
	// Enter into Frame
	driver.switchTo().frame("rightMenu");
	
	// without mouse over add click activity on Add Button
	//driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
	
	driver.findElement(By.name("txtEmpLastName")).sendKeys("Saw");
	Thread.sleep(1000);
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Ranjeet");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='button'][@value='Save']")).click();
	Thread.sleep(3000);
	System.out.println("Add Employee Completed ");
	// Exit into Frame
	driver.switchTo().defaultContent();
	 driver.findElement(By.linkText("Logout")).click();
    
	
	Thread.sleep(3000);
	 driver.close();
	System.out.println("Logout Completed");
	}

}
