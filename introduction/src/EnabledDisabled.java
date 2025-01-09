
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnabledDisabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //select round trip radio button
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        //check if the return date is enabled
        // Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
        {
            System.out.println("it's enabled");
            Assert.assertTrue(true);
        }
        else
        {
            Assert.fail();
        }

        //select one way radio button
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5"))
        {
            System.out.println("it's disabled");
            Assert.assertTrue(true);
        }
        else
        {
            Assert.fail();
        }

        Thread.sleep(2000);
        driver.quit();
        

    }
}
