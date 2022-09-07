package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googleexample {
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("maniraj28912@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(" gsgsgs");

		driver.findElement(By.xpath("//button[@name='login']")).click();

	}
}