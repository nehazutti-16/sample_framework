package pac1;

import org.testng.annotations.Test;

public class CreateContactTest {
	
	@Test
	public void createcontacttest() {
         String url= System.getProperty("url");
         String browser= System.getProperty("browser");
         String usn= System.getProperty("usn");
         String pwd= System.getProperty("pwd");
         
         System.out.println( url + usn + pwd);
         System.out.println("execute createcontactTest");
	}
	@Test
	public void modifycontacttest() {
		System.out.println("execute modify contact test");
	}

}
