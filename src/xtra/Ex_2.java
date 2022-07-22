package xtra;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Ex_2 {
	public static void main(String[] args)throws Exception {
		 System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		 
		 // Login 
		 
		 System.out.println(driver.getTitle());
		 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		 
		 // Alert/ PopUp
		
		 Thread.sleep(3000);
		  driver.findElement(By.name("Submit")).click();
		 Thread.sleep(3000);
		 
		 //Alert
		 Alert alrt = driver.switchTo().alert();
		 System.out.println(alrt.getText());
		 Thread.sleep(3000);
		 alrt.accept();
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit"); 
		System.out.println("Password match");
		driver.findElement(By.name("Submit")).click();
		System.out.println(driver.getTitle());
		
			// Mouse Over
			System.out.println("Open PIM ");
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();	
			Thread.sleep(3000);
			driver.findElement(By.linkText("Add Employee")).click();
			System.out.println(" Add Employee completed");
			Thread.sleep(3000);
			
			//Enter into frame
			 driver.switchTo().frame("rightMenu");
			 
	// Without mouse over //	 Thread.sleep(4000);
		   //	 driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
	
			 
		 driver.findElement(By.name("txtEmpLastName")).sendKeys("Sawant");
		 System.out.println("Add last name");
		 driver.findElement(By.name("txtEmpFirstName")).sendKeys("Ranjeet");
		 System.out.println("Add first name");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/div[2]/input[1]")).click();
		 
		 // Exit from frame
		 driver.switchTo().defaultContent();
		 Thread.sleep(4000);
		 driver.findElement(By.linkText("Logout")).click();               
		 System.out.println("Logout App");

		 
		 Thread.sleep(3000);
		 driver.close();
		 System.out.println("Close Application");
		 
		 
			
}
}