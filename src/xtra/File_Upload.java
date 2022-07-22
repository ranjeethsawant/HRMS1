package xtra;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class File_Upload {
	public static void main(String args[]) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");                      // username
		 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");                      // password
		 driver.findElement(By.name("Submit")).click();
		 System.out.println("login completed");
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("PIM")).click();
		 System.out.println("Enter into PIM ");
		 Thread.sleep(3000);
         
		 // Enter into frame
		 
		 driver.switchTo().frame("rightMenu");
		 driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
		 System.out.println("Click on Add Buton");
		 Thread.sleep(3000);
		 driver.findElement(By.name("txtEmpLastName")).sendKeys("Sawant");
		 System.out.println("Enter last Name");
		 driver.findElement(By.name("txtEmpFirstName")).sendKeys("Ranjeet");
		 System.out.println("Enter First Name");
		 Thread.sleep(3000);
		 
		 WebElement browser = driver.findElement(By.xpath("//input[@type='file'][@class='fileselect']")); // ChooseFile
	     
		 browser.sendKeys("C:\\Users\\HP\\OneDrive\\Documents\\Name_TestEngineer_Fresher.docx");        
		                                  //file location&file name .docs or othr chk from properties
		     System.out.println("File upload Successul");
		     Thread.sleep(3000);
		    driver.findElement(By.xpath("//input[@type='button'][@value='Save']")).click();       // save
		    		 Thread.sleep(3000);
		 
		 // Exit to frame
		 driver.switchTo().defaultContent();
         driver.findElement(By.linkText("Logout")).click();
         System.out.println("Logout Completed");
		 Thread.sleep(3000);
		 driver.close();
		 
				 
	}
}
