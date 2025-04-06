import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPageAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //input username
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

        //input password
        driver.findElement(By.id("password")).sendKeys("learning");

        //select a radio button
        driver.findElements(By.xpath("//span[@class='checkmark']")).get(1).click();

        //click ok button from the alert using explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();

        //select from a dropdown
        WebElement staticDropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByValue("consult");

        //check the checkbox
        driver.findElement(By.id("terms")).click();

        //click on the submit button
        driver.findElement(By.id("signInBtn")).click();

        //add all items to cards
        List<WebElement> items = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
        for (int i = 0; i < items.size(); i++) {
            items.get(i).click();
        }

        //click checkout button
        driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

        
        

    }
}
