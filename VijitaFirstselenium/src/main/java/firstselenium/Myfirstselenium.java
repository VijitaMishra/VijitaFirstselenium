package firstselenium;

	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Myfirstselenium {
		
		public static void main (String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://with-bugs.practicesoftwaretesting.com/#/");
			WebElement signinele=driver.findElement(By.xpath("//a[text()='Sign in']"));
			signinele.click();
	
			WebElement registerele=driver.findElement(By.xpath("//a[text()='Register your account']"));
			registerele.click();
			WebElement firstnameele=driver.findElement(By.xpath("//input[@id='first_name']"));
			firstnameele.sendKeys("Tom");
			WebElement lastnameele=driver.findElement(By.xpath("//input[@id='last_name']"));
			lastnameele.sendKeys("Smith");
			WebElement dobele=driver.findElement(By.xpath("//input[@id='dob']"));
			dobele.sendKeys("1990-08-25");
			WebElement addressele=driver.findElement(By.xpath("//input[@id='address']"));
			addressele.sendKeys("2 INDERHEIGHTS DR");
			WebElement postalcodeele=driver.findElement(By.xpath("//input[@id='postcode']"));
			postalcodeele.sendKeys("L6Z 3M4");
			WebElement cityele=driver.findElement(By.xpath("//input[@id='city']"));
			cityele.sendKeys("Brampton");
			WebElement countryele=driver.findElement(By.xpath("//input[@id='state']"));
			countryele.sendKeys("Ontario");
			WebElement stateele=driver.findElement(By.xpath("//select[@id='country']"));
			stateele.sendKeys("Canada");
			WebElement phoneele=driver.findElement(By.xpath("//input[@id='phone']"));
			phoneele.sendKeys("4253658524");
			WebElement emailele=driver.findElement(By.xpath("//input[@id='email']"));
			emailele.sendKeys("tom.smith@hotmail.com");
			WebElement passwordele=driver.findElement(By.xpath("//input[@id='password']"));
			passwordele.sendKeys("Tomsmi@1235");
			
			Thread.sleep(3000);
			WebElement submitele=driver.findElement(By.xpath("//div/button[@data-test='register-submit']"));
			submitele.click();
			
		}

}
