package firstselenium;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Myfirstselenium {
		
		public static void main (String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://with-bugs.practicesoftwaretesting.com/#/");
			WebElement signinele=driver.findElement(By.xpath("//a[text()='Sign in']"));
			signinele.click();
			Thread.sleep(3000);
			WebElement registerele=driver.findElement(By.xpath("//a[text()='Register your account']"));
			registerele.click();
			
		}

}
