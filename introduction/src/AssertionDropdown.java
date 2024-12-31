import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionDropdown {
    public static void main(String[] args) throws InterruptedException {
        // Write your code here
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Check the checkbox
       
       Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
       driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
       Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
       Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);


       driver.findElement(By.id("divpaxinfo")).click();
       Thread.sleep(2000);
       for (int i = 1; i < 5; i++) {
           driver.findElement(By.id("hrefIncAdt")).click();
       }
       driver.findElement(By.id("btnclosepaxoption")).click();
       Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

       //using index of xpath
       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       driver.findElement(By.xpath("//a[@value='IXB']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

       //using parent-child relationship
       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='IXE']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXB']")).click();




       Thread.sleep(2000);
       driver.quit();
    }
}
