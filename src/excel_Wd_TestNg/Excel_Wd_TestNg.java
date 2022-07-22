package excel_Wd_TestNg;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Wd_TestNg {
	WebDriver driver;

	@BeforeClass
	public void startUp() {
	System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");
	driver = new ChromeDriver();
	}

	@AfterClass
	public void tearDown() {
	driver.close();	
	}
	
	@Test
	public void tc001()
			throws Exception {
	
//Excel
	FileInputStream f = new FileInputStream("S:\\XLS\\Login_logout.xls");
	Workbook  wb = Workbook.getWorkbook(f);
	Sheet st = wb.getSheet(0);
	String un = st.getCell(0,1).getContents();
	String pw =	st.getCell(1,1).getContents();
		Reporter.log(un);
		Reporter.log(pw);
   driver.navigate().to("http://183.82.103.245/nareshit/login.php");
   System.out.println("Application Opened");
   
   driver.findElement(By.name("txtUserName")).sendKeys(un);
   driver.findElement(By.name("txtPassword")).sendKeys(pw);
   driver.findElement(By.name("Submit")).click();
   Thread.sleep(5000);
   System.out.println("Login Completed");
   Reporter.log("Login Completed");
   
   driver.findElement(By.linkText("Logout")).click();
   Thread.sleep(3000);
   System.out.println("LogOut Completed");
   Reporter.log("LogOut Completed");
   
  
   driver.close();
   Thread.sleep(3000);
   System.out.println("Application Closed");
   Reporter.log("Application Closed");            
	
}
}
