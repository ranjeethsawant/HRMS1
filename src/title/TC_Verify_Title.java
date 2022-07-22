package title;    // Hard Coded.
   import org.openqa.selenium.WebDriver; 
   import org.openqa.selenium.chrome.ChromeDriver;
   import org.openqa.selenium.By;
		
   public class TC_Verify_Title {
   public static void main(String[] args) throws Exception  {  
			// Test steps :
			/* 1.Open Application.
			   2.Verify Page Title.
			   3.Login into Application.
			   4.Verify Page Title.
			   5.Click on Logout Option.
			   6.Close Application / Browser.
			 */
		 
    System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe"); // Launch Browser.
    WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");                 // Enter URL.   
	                                                                            // 1.Open Application.
	// Verify Title
	// Actual Result compare Expected Result
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
	{
		System.out.println("Title Matched");                                    // 2.Verify Page Title.
	}
	else
	{
		System.out.println("Title not Match");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");              // Enter Username.
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");              // Enter Password.
	driver.findElement(By.name("Submit")).click();                            // 3.Login into Application.
	System.out.println("Login Completed");
	Thread.sleep(3000);
//	System.out.println(driver.getTitle());                       // To write direct or condition.
	if(driver.getTitle().equals("OrangeHRM"))
	{                                                                         // 4.Verify Page Title.
		System.out.println("Title Matched");
	}
	else
	{
		System.out.println("Title not Match");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.linkText("Logout")).click();                        // 5.Click on Logout Option.
	System.out.println("Logout Completed");
	driver.close();                                                           // 6..Close Application.
	System.out.println("Close Application");
		}
		}	


