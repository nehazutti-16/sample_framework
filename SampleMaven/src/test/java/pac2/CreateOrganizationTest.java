package pac2;

import org.testng.annotations.Test;

public class CreateOrganizationTest {

	@Test
	public void createorgtest() {
		System.out.println("execute create org test");
		 String url= System.getProperty("url");
         String browser= System.getProperty("browser");
         String usn= System.getProperty("usn");
         String pwd= System.getProperty("pwd");
         
         System.out.println( url + usn + pwd);
         System.out.println("execute createcontactTest");
	}
	@Test
	public void modifyorgtest() {
		System.out.println("modify create org test");
	}
}
