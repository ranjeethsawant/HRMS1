package wedDrivr_TestNg;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	
	public class Exp_TestNg_ {

	@BeforeClass
	public void login() {
	    System.out.println("Login completed");
	}
	@AfterClass
	public void logout() {
	    System.out.println("Logout completed");
	}
	@Test
	public void addemp() {
	    System.out.println("add emp");
	}
	@Test
	public void delemp() {
	    System.out.println("del emp");
	}
	}

