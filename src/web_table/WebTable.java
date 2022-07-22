package web_table;
    import org.openqa.selenium.By; 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WebTable {
	public static void main(String args[]) throws Exception{
	    //Test Steps
	System.setProperty("webdriver.chrome.driver", "S:\\Jar_Files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///S:/WebTable.html");                                 // URL
	//count
	int row=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();       // tr for row
	int col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size(); // 1row td for column
	int row_col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size(); // 7R & 4C
	System.out.println(row);
	System.out.println(col);
	System.out.println(row_col);
	//data--cell                                // Retrive one perticular block / cell
	
	String celldata=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
	System.out.println(celldata);
	//data--table                               // Retrive data from all cell       
	// DT var VV
	for(int i=1; i<=row;i++) {
	String data=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText(); 
	
	                                                    // Retrive data from perticular cell or Hole Table
	Thread.sleep(3000);
	System.out.println(data);
	}
	driver.close();
	}
	}


