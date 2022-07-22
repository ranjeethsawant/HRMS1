package dropDown;
import org.openqa.selenium.WebDriver;      
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
	
public class Dropdwn_chkbx {
   /*
    Test Steps :
      1. Open Application.
      2. Login into Application.
      3. Select Employee ID in search for Text-Box.
      4. Enter Employee id in search for textBox.
      5. Click on Search Button.
      6. Click on CheckBox.
      7. Click on Delete Button.
      8. Click on Logout Option.
      9. Close Application. 
    */
	public static void main(String[] args) throws Exception  {
   System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");//1. Open Application.
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();                        // 2. Login into Application.
		System.out.println("Login Completed");
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");                       // Enter into Frame.
		Select s = new Select(driver.findElement(By.name("loc_code")));    // 3. Select Employee ID in search for Text-Box.
		
		// s.selectByIndex(0);
		// s.selectByValue("0");
		
		s.selectByVisibleText("Emp. ID");                          //4. Enter Employee id in search for textBox.
	    System.out.println("Select Employee ID from DropDown ");
		Thread.sleep(3000);
		
		driver.findElement(By.name("loc_name")).sendKeys("0735");
		Thread.sleep(3000);
		
		System.out.println("Enter ID");
		driver.findElement(By.xpath("//input[@type='button'][@value='Search']")).click(); //5. Click on Search Button.
		System.out.println("Search Employee");
		Thread.sleep(3000);
		
		driver.findElement(By.name("chkLocID[]")).click();                          //  6. Click on CheckBox.
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='button'][@value='Delete']")).click(); //7. Click on Delete Button.
		System.out.println("Delete Employee ID ");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();   
		
		// Exit from Frame.
		driver.findElement(By.linkText("Logout")).click();                     //  8. Click on Logout Option.
		System.out.println("Logout Completed");
		Thread.sleep(3000);
		
        driver.close();                                                     // 9. Close Application.
		

}

}
