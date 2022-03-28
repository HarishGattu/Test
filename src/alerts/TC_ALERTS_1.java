package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class TC_ALERTS_1 {
	public static void main(String[] args) throws Exception {
		
		System.setProperty
		("webdriver.gecko.driver","D:\\Testing\\Testing Softwares\\Softwares\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
		WebElement username=driver.findElement(By.xpath("//input[@name='txtUserName']"));
		username.sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		
		//ALERT CODE.
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		//To Retrive data from alert
		System.out.println(alt.getText());
		//To click on ok button
		alt.accept();
		WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
	}

}
