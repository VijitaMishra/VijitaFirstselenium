package verifytest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDown {
	
	@Test
	public void dropdowntest(){
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		
		WebElement dropdownele = driver.findElement(By.xpath("//a[text()='Dropdown']"));
		dropdownele.click();
		
		WebElement dropdownlistele = driver.findElement(By.xpath("//h3[text()='Dropdown List']"));
		String head = dropdownlistele.getText();
		
		Assert.assertEquals(head, "Dropdown List");
		
		WebElement dropDownele = driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select dd = new Select(dropDownele);
		dd.selectByContainsVisibleText("Option 2");
		
		
	}

}
