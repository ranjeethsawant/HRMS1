package wedDrivr_TestNg;
	import org.testng.annotations.Test;
	public class Exp_Testng {
		
	@Test                          // one @Test is equal to one testcase/scenario in report
	public void login() {
	    System.out.println("Login completed");
	}
	
	@Test
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

