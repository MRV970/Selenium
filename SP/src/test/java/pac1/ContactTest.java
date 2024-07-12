package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createcontacttest() {
		String Url=System.getProperty("url");
		String Browser=System.getProperty("browser");
		String Username=System.getProperty("username");
		String Password=System.getProperty("password");
		System.out.println(Url);
		System.out.println(Browser);
		System.out.println(Username);
		System.out.println(Password);
	}
	@Test
	public void modifycontacttest() {
		System.out.println("executing modifycontacttest");
	}

}
