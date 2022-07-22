package capturing_screen_shots;
                                    // Add Commons.io.jar File
    import java.io.File;   
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class ScreenShot {
		/*
		 Test Steps                      // Any error to capture screenshot      
		 1. Open Application
		 2. Login into Application
		 3. To perform MouseOver on PIM element
		 4. Click on Add Employee Option      
		 5. Click on logout option
		 6. Close Application
		 */
	public static void main(String args[]) throws Exception {
	    System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe"); // 1.App. open
	    WebDriver driver = new ChromeDriver();
	    System.out.println("Open Application");
	    driver.manage().window().maximize();
	    try        {
	        driver.navigate().to("http://183.82.103.245/nareshit/login.php");    // URL
	                                                                          // 2.login into Application
	        driver.findElement(By.name("txtUserName")).sendKeys("nareshit");     // username
	        driver.findElement(By.name("txtPassword")).sendKeys("nareshit");     // password
	        driver.findElement(By.name("Submit")).click();     
	        System.out.println("Login Sucessfull");
	          Thread.sleep(3000);
	        WebElement element = driver.findElement(By.linkText("PIM")); //3. To perform MouseOver on PIM element 
	         Actions action = new Actions(driver);
	        action.moveToElement(element).perform();
	        Thread.sleep(3000);
	    driver.findElement(By.linkText("Add Employee")).click();     //4. Click on Add Employee Option 
	      System.out.println("Click on Add Employee");  
	    Thread.sleep(4000);
	    System.out.println("Clicked on submenu"); 
	    driver.findElement(By.linkText("logout")).click();    // link -- Logout spel.cor.Capture screenShot
	    Thread.sleep(3000);
	    } 
	    catch(Exception e)        {            // try & catch block use for find/identify and catch the error
	File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f1, new File("S:\\Jar_Files\\ScreenShot\\ScreenShot.png"));   // folder loc. take scrn.shot
	System.out.println("ScreenShot Successfull");
	      }
	    driver.quit();                                      // used driver.close() || quit()
	}
	}
