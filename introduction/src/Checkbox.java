import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Check the checkbox
       
       System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
       driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
       System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
       System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
       Thread.sleep(2000);
       driver.quit();
    }
}
