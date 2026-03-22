package faker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;

public class Tryfaker {
	
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://with-bugs.practicesoftwaretesting.com/#/");
		WebElement signinele=driver.findElement(By.xpath("//a[text()='Sign in']"));
		signinele.click();

		WebElement registerele=driver.findElement(By.xpath("//a[text()='Register your account']"));
		registerele.click();
		WebElement firstnameele=driver.findElement(By.xpath("//input[@id='first_name']"));
		firstnameele.sendKeys(new Faker().name().firstName());
		WebElement lastnameele=driver.findElement(By.xpath("//input[@id='last_name']"));
		lastnameele.sendKeys(new Faker().name().lastName());
		WebElement dobele=driver.findElement(By.xpath("//input[@id='dob']"));
		dobele.sendKeys("1990-08-25");
		WebElement addressele=driver.findElement(By.xpath("//input[@id='address']"));
		addressele.sendKeys(new Faker().address().fullAddress());
		WebElement postalcodeele=driver.findElement(By.xpath("//input[@id='postcode']"));
		postalcodeele.sendKeys(new Faker().address().zipCode());
		WebElement cityele=driver.findElement(By.xpath("//input[@id='city']"));
		cityele.sendKeys( new Faker().address().city());
		WebElement countryele=driver.findElement(By.xpath("//input[@id='state']"));
		countryele.sendKeys(new Faker().address().state());
		WebElement stateele=driver.findElement(By.xpath("//select[@id='country']"));
		stateele.sendKeys(new Faker().address().country());
		WebElement phoneele=driver.findElement(By.xpath("//input[@id='phone']"));
		phoneele.sendKeys(new Faker().phoneNumber().subscriberNumber());
		WebElement emailele=driver.findElement(By.xpath("//input[@id='email']"));
		emailele.sendKeys(new Faker().internet().emailAddress());
		WebElement passwordele=driver.findElement(By.xpath("//input[@id='password']"));
		passwordele.sendKeys(new Faker().internet().password());
		
		Thread.sleep(2000);
		WebElement submitele=driver.findElement(By.xpath("//button[@data-test='register-submit']"));
		submitele.click();
		
	}
	

}



