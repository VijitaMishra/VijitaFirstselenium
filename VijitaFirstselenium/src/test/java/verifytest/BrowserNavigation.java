package verifytest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserNavigation {
	
	@Test
	public void testbrowsernavi() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		
		WebElement formauthele = driver.findElement(By.xpath("//a[text()='Form Authentication']"));
		formauthele.click();
		
		WebElement headingele = driver.findElement(By.xpath("//h2[text()='Login Page']"));
		String head = headingele.getText();
		
		Assert.assertEquals(head, "Login Page");
		
		driver.navigate().back();
		
		WebElement homepageele = driver.findElement(By.xpath("//h1[text()='Welcome to the-internet']"));
		head = homepageele.getText();
		
		Assert.assertEquals(head, "Welcome to the-internet");
		
		driver.quit();
	}
}
