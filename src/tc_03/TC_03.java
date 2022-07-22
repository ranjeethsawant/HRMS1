package tc_03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class TC_03 {
   /*
     Test steps
       1.Open Browser
       2.Enter google URL
       3.Retrive all the links from google page
       4.Close Application
       
    */
	public static void main(String[] args)  throws Exception {
		System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");                            // google URL
		Thread.sleep(3000);
		
		List<WebElement>Links = driver.findElements(By.tagName("a"));              // 
		
		for(WebElement lks : Links) {                                              // for each loops
		System.out.println(lks.getText());
		Thread.sleep(1000);
		}
		driver.close();
		Thread.sleep(3000);
		}
	    }
	    


