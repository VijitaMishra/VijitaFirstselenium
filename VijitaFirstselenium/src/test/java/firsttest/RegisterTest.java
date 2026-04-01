package firsttest;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {
	
	@Test
	public void RegisterFirstTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://with-bugs.practicesoftwaretesting.com/#/");
		WebElement signinele=driver.findElement(By.xpath("//a[text()='Sign in']"));
		signinele.click();

		WebElement registerele=driver.findElement(By.xpath("//a[text()='Register your account']"));
		registerele.click();

	}
}
