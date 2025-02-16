
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //enter name and click alert
        String text = "Khun Shine Si Thu";
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();

        //alert box handling
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        //enter name and confirm
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.id("confirmbtn")).click();

        //alert box handling
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();


    }
}
