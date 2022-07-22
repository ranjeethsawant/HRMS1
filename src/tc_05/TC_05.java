package tc_05;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.By;
	
	    public class TC_05 {
		public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");  //  Open Application.
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");   //  Enter Username.
	    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");   //  Enter Password.
		driver.findElement(By.name("Submit")).click();                     // Click on Login
		Thread.sleep(3000);
		// Enter into frame
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/input[2]")).sendKeys("Sawant");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/input[3]")).sendKeys("Ranjeet");
		Thread.sleep(3000);
		
		// File upload 
		WebElement fileInput = driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/input[6]"));
		fileInput.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\2022-07-07.png");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/div[2]/input[1]")).click();
		Thread.sleep(3000);
		
		
		//Exit from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.close();
}
}