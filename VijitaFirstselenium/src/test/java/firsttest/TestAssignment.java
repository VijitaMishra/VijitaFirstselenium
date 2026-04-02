package firsttest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAssignment {
	
	@Test
	
	public void testfirstassignment() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");		
		
		WebElement dynamicele = driver.findElement(By.xpath("//a[text()='Dynamic Controls']"));
		dynamicele.click();
		
		WebElement removeele = driver.findElement(By.xpath("//button[text()='Remove']"));
		removeele.click();
		
		WebElement addele = driver.findElement(By.xpath("//button[text()='Add']"));
		addele.click();
		
		WebElement checkele = driver.findElement(By.xpath("//div[text()=' A checkbox']"));
		checkele.click();
	}

}
