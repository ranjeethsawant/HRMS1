package wedDrivr_TestNg;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Exp_WD_Testng {
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
driver.navigate().to("http://183.82.103.245/nareshit/login.php");

Reporter.log(driver.getTitle()); 
System.out.println(driver.getTitle());

System.out.println("Application opened");                          //JAVA : Console

Reporter.log("Application Opened");                             //TestNG : htmlReport
Thread.sleep(3000);
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);

System.out.println("Login Completed");      
Reporter.log("Login Completed");


Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();

// To check generated html Report - refresh click on test input_properties_click loc file Sym._click test output
}
}
