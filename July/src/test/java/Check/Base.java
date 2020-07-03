package Check;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {
	
	
	WebDriver driver;
	@Test
	public void PageObj(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Blue box");
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.className("nav-a  ")).click();
		driver.quit();
}
}
