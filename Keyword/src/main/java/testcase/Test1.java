package testcase;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import source.Keyword;

public class Test1 {
	WebDriver driver;
	@BeforeMethod
	public void tc_01(){
	    
	Keyword.openBrowser("Chrome");
		Keyword.openURL("https://www.facebook.com/");
	//Keyword.getWebElement("XPATH", "span[@class='nav-line-2 ']");	
     
	}
	@Test
	public void tc_02(){
		
	Keyword.fName("//input[@id='u_0_m']","Priyanka");
		Keyword.lName("//input[@id='u_0_o']","Mahajan");
		Keyword.email("//input[@id='u_0_r']","priyagujar10@gmail.com");
		Keyword.email("//input[@id='u_0_u']","priyagujar10@gmail.com");
Keyword.passWord("//input[@id='u_0_w']","priya9404523380");
	}
	
	


}