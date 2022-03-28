package alerts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;

public class TC_alerts {
	static WebDriver driver;
	
	
	static String loginname="txtUserName";
	static String password1="txtPassword";
	static String username="admin";
	static String password="admin";
	static String loginbutton="Submit";
	static String logoutbutton="Logout";
	
	@BeforeClass
	public static void openbrowser() {
		System.setProperty("webdriver.gecko.driver","D:\\Testing\\Testing Softwares\\Softwares\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
		//Enter URl
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	}
	@Test
	public static void logindetails() throws Exception {
		driver.findElement(By.name(loginname)).sendKeys(username);
		driver.findElement(By.name(loginbutton)).click();
		
		//Alert alt=new Alert();
		Alert alt=driver.switchTo().alert();
		Thread.sleep(3000);
		alt.accept();
		driver.findElement(By.name(password1)).sendKeys(username);
		driver.findElement(By.name(loginbutton)).click();
	}
	@AfterClass
	public static  void logoutdetails() {
		driver.findElement(By.linkText(logoutbutton)).click();
	}
	
	/*public static void main(String[] args) throws Exception {*/
		
		/*
		 * TC_alerts.openbrowser(); TC_alerts.logindetails(); TC_alerts.logoutdetails();
		 */
		
	}


