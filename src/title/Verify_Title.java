package title;    // Passing from Variable.
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.By;
	public class Verify_Title {
		//  Test Steps
		/* 1.Open Application.
		   2.Verify Page Title.
		   3.Login into Application.
		   4.Verify Page Title.
		   5.Click on Logout Option.
		   6.Close Application / Browser.
		 */
	
		//TestData : DT & Var
	       //DT   Var            VV
	static String url      = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	static String title1   = "OrangeHRM - New Level of HR Management";
	static String title2   = "OrangeHRM";

	public static void main(String args[]) throws Exception{
	    //Test Steps
	System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to(url);
	//Verify Title
	// Actual Result   compare ExpectedResult
	if(driver.getTitle().equals(title1)) {
	    System.out.println("Title matched");
	}
	else {
	    System.out.println("Title not matched");
	    System.out.println(driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	Thread.sleep(3000);
	if(driver.getTitle().equals(title2)) {
	System.out.println("Title matched");    
	}
	else {
	System.out.println("Title not matched");
	System.out.println(driver.getTitle());
	}
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	driver.close();
	}
	}

