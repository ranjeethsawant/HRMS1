package mouse_Over;
	import org.openqa.selenium.WebDriver;     
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.By;
	public class  Extr{
		// Test Steps  
		/*
		 1.Open Application
		 2.Login into Application
		 3.Perform Mouse Over to PIM element
		 4.Click on Add Employee Option
		 5.Click on Logout Option
		 6.Close Application
		 */
		public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauch Browser");                                  // 1. Open Application
		System.out.println("Enter URL");
		driver.get("http://183.82.103.245/nareshit/login.php");               
	    System.out.println("open Application");
	    Thread.sleep(3000);
	    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");     // 2.Login into Application     
	    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	    Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	    driver.findElement(By.name("Submit")).click();
	    System.out.println("Login Successfull");                            
		// Mouse over
	    Actions ac = new Actions(driver);
        ac.moveToElement(driver.findElement(By.linkText("Recruitment"))).perform();	   
       
        driver.findElement(By.linkText("Job Vacancies")).click();
        
        System.out.println("Logout App");
        
       // Thread.sleep(3000);
     //   driver.close();    
		
		}	
        }
