package frames__;
import org.openqa.selenium.WebDriver;     
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class Extra {
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
        Thread.sleep(3000);
        driver.findElement(By.linkText("Job Vacancies")).click();
        Thread.sleep(3000);
        // Enter into frame
        
        driver.switchTo().frame("rightMenu");
        Thread.sleep(3000);
        
        driver.findElement(By.name("loc_name")).sendKeys("5577");
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input[2]")).click();
        
        Alert alrt = driver.switchTo().alert();
        System.out.println(alrt.getText());
        alrt.accept();
        
       driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")).click();
        Thread.sleep(3000);
        
        //Exit from frame
        driver.switchTo().defaultContent();
        System.out.println("Logout App");
        
        Thread.sleep(3000);
      driver.close();    
		
}
}
