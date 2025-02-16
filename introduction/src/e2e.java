import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2e {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");

        //select 2 adults
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int i=0; i<2; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        //choose orgin city
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
        Thread.sleep(2000);
        //choose destination city
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='AMD']")).click();

        Thread.sleep(2000);
        //delect the date
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

        //click on search button
        driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
        

    }
}
