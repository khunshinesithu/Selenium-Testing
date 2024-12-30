
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.id("inputUsername")).sendKeys("Shine Si Thu");
			driver.findElement(By.name("inputPassword")).sendKeys("123haha");
			driver.findElement(By.className("signInBtn")).click();
			
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			
			
			driver.findElement(By.linkText("Forgot your password?")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Miley");
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("mileycyrus@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
			driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("shinesithu@miley.com");
			driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("09123456789");
			driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).clear();
			driver.findElement(By.xpath("//form/input[3]")).sendKeys("0987654321");
			
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			System.out.println(driver.findElement(By.cssSelector("form p")).getText());
			
			driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Miley");
			driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
			driver.findElement(By.xpath("//input[@name='chkboxOne']")).click();
			driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
			
}
}
