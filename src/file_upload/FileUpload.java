package file_upload;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class FileUpload {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");  //  Open Application.
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");   //  Enter Username.
    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");   //  Enter Password.
	driver.findElement(By.name("Submit")).click();                     // Click on Login
	
	// inter into frame
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();    // Click on Add btn
     driver.findElement(By.name("txtEmpLastName")).sendKeys("Sawant");                // Enter Last Name
     driver.findElement(By.name("txtEmpFirstName")).sendKeys("Ranjeet");              // Enter First Name
     Thread.sleep(4000);
     
     WebElement inputfile =  driver.findElement(By.xpath("//input[@type='file'][@class='fileselect']"));
    inputfile.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\2022-07-16.png");
     
                                  //file location& \\ file name .docs or png - othr chk from properties
     System.out.println("File Upload Successul");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@type='button'][@value='Save']")).click();       // save
	 Thread.sleep(3000);
    		
   // Exit from frame
     driver.switchTo().defaultContent();
     driver.findElement(By.linkText("Logout")).click();                               // Logout
     Thread.sleep(3000);
     driver.close();                                                               // Close
     
	}

}
