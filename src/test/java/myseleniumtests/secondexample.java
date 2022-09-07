package myseleniumtests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondexample {
	public static void main(String[] args) throws AWTException {
		Robot robot =new Robot();
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//input[@type='Search']"));
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("srikari bodugam");
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Keys.ENTER");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
