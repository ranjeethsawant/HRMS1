package my_Project; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class All {
public static void main(String args[]) throws Exception {

	System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	System.out.println("Lauching the Browser");
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Open Application");

	System.out.println("Enter username & password ");Thread.sleep(3000);
    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
    Thread.sleep(3000); 
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	System.out.println("Username & Password Accepted");
	driver.findElement(By.name("Submit")).click();
//MouseOver
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	System.out.println("MouseOver Completed");
//Click on Sub_Menu
	Thread.sleep(3000);
	driver.findElement(By.linkText("Employee List")).click();
	System.out.println("Click on SubMenu");
//Frames
	//Enter into frame
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@type='button'][@value='Search']"));
	Thread.sleep(3000);
	System.out.println("Click on Add Button");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Ranjeet");
    Thread.sleep(3000);
    driver.findElement(By.name("txtEmpLastName")).sendKeys("Sawant");
    driver.findElement(By.id("btnEdit")).click(); 
    Thread.sleep(3000);
    System.out.println("Add new Employee");
    		
   //Exit from frame	
    driver.switchTo().defaultContent();
     driver.findElement(By.linkText("Logout")).click();
     System.out.println("Logout App");
    
	
	
	
	
	
	
/*	
	driver.findElement(By.xpath("//*[@id=\"loc_code\"]")).click();
	driver.findElement(By.name("//select[@id='loc_code'][@name='local_code]")).click();
	driver.findElement(By.xpath("//input[@type='button'][@value='Search']")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();   */
	
	driver.close();
	
}
}
