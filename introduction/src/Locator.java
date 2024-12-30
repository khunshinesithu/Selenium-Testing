

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	public static void main() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Shine Si Thu");
		driver.findElement(By.name("inputPassword")).sendKeys("123haha");
		driver.findElement(By.className("signInBtn")).click();
		
	}

}
