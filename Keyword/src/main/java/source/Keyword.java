package source;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import testcase.constants;


/**This class is used for open Browser
 * <ol>
 * <li>Chrome</li>
 * <li>Firefox</li>
 * 
 */

  public class Keyword {
	  private static WebDriver driver;
	 
  public static void openBrowser(String browserName){
	switch(browserName){
	case("Chrome"):
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
	 driver=new ChromeDriver();
		break;
	case("Firefox"):
		WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
	 break;
	 default:
		 System.out.println("invalid browserName:"+browserName);
	}
  }
  /*
   * This method is used to open URL.
   * Enter URL
   */
	public static void openURL(String url){
		 driver.get(url);
		 
	}
	
	
	/**
	 * Below methods are used to send info which required.
	 * @param Fname
	 */
	public static void fName(String locator,String Fname){
		driver.findElement(By.xpath(locator)).sendKeys(Fname);
		
	}
	public static void lName(String locator,String Lname){
		driver.findElement(By.xpath(locator)).sendKeys(Lname);
	}

	public static void email(String locator,String email){
		driver.findElement(By.xpath(locator)).sendKeys(email);
	}
	public static void passWord(String locator,String pw){
		driver.findElement(By.xpath(locator)).sendKeys(pw);
	}
	
  
  }	
	
	
	


