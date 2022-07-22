package xtra;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_chekbox {
public static void main(String args[]) throws Exception{
    //Test Steps
System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(3000);
driver.switchTo().frame("rightMenu");
// DT Var VV
for(int i=1;i<=10;i=i+2) {
driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td[1]/input")).click();
System.out.println("clicked on checkbox of " + i);
Thread.sleep(2000);
}
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout Successfull");
driver.quit();
System.out.println("Close the Application");
 } 
 }

