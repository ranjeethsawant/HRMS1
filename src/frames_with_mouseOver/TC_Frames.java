package frames_with_mouseOver;
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
public class TC_Frames {
	/*
	 Test Steps
	   1. Open Application
	   2. Login into Application
	   3. Click on Add Button
	   4. Enter First Name
	   5. Enter Last Name
	   6. Click on Save Button
	   7. Click on Logout Button
	   8. Close Application
	   
	 */
		public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");   
		WebDriver driver = new ChromeDriver();                                     
		System.out.println("Lauch Browser");
		System.out.println("Enter URL"); 
		driver.get("http://183.82.103.245/nareshit/login.php");                 // 1. Open Application
	    System.out.println("open Application");
	    Thread.sleep(3000);
	    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	    Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	    driver.findElement(By.name("Submit")).click();                         // 2. Login into Application
	    System.out.println("Login Successfull");
	    
	    //Mouseover; 
	    Actions ac = new Actions(driver);
	    ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	    System.out.println("Mouse Over Complited");
	  
	    // Click on Submenu ;
	    driver.findElement(By.linkText("Employee List")).click();
	    Thread.sleep(4000);
	  
	    //Enter into Frame ;                                                // 3. Click on Add Button
	    driver.switchTo().frame("rightMenu");
	    driver.findElement(By.xpath("//input[@class='plainbtn'][@type='button'][@onclick='returnAdd();']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.name("txtEmpFirstName")).sendKeys("Ranjeet");  // 4. Enter First Name
	    System.out.println("Enter First Name");
	    Thread.sleep(3000);
	    driver.findElement(By.name("txtEmpLastName")).sendKeys("Sawant");    // 5. Enter Last Name
	    System.out.println("Enter Last Name");
	    driver.findElement(By.id("btnEdit")).click();                        // 6. Click on Save Button
	    Thread.sleep(3000);
	    System.out.println("Add new Employee");
	    		
	   //Exit from frame	
	    driver.switchTo().defaultContent();                                  // 7. Click on Logout Button
	     driver.findElement(By.linkText("Logout")).click();
	     System.out.println("Logout App");
	    
	    Thread.sleep(3000);
	    driver.close();                                                    //  8. Close Application
	    System.out.println("Close Browser");
		}
		
	}

