import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        //fill name
        driver.findElement(By.name("name")).sendKeys("Khun Shine Si Thu");

        //fill email
        driver.findElement(By.name("email")).sendKeys("mileycyrusisthebest@gmail.com");

        //fill password
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("mileycyrusisalegend");

        //check the checkbox
        driver.findElement(By.id("exampleCheck1")).click();

        //select gender dropdown
        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select genderDropdown = new Select(dropdown);
        genderDropdown.selectByIndex( 1);

        //click on the occupation radio button
        driver.findElement(By.id("inlineRadio1")).click();

        //select the date of birth
        driver.findElement(By.cssSelector("input[name = 'bday']")).sendKeys("1/1/2004");
       

        //click on the submit button
        driver.findElement(By.cssSelector("input[type = 'submit']")).click();

        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText(), "x Success! The Form has been submitted successfully!.");

        Thread.sleep(2000);
        driver.quit();
        

    }
}


// import org.openqa.selenium.Keys;







// import org.openqa.selenium.WebDriver;







// import org.openqa.selenium.WebElement;







// import org.openqa.selenium.chrome.ChromeDriver;







// import org.openqa.selenium.support.ui.Select;







// public class Assignment {







// public static void main(String[] args) {







// // TODO Auto-generated method stub







// System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");



// WebDriver driver=new ChromeDriver();





// driver.get("https://rahulshettyacademy.com/angularpractice/");

// driver.findElement(By.name("name")).sendKeys("rahul");

// driver.findElement(By.name("email")).sendKeys("hello@abc.com");

// driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");

// driver.findElement(By.id("exampleCheck1")).click();

// WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

// Select abc = new Select(dropdown);

// abc.selectByVisibleText("Female");

// driver.findElement(By.id("inlineRadio1")).click();

// driver.findElement(By.name("bday")).sendKeys("02/02/1992");

// driver.findElement(By.cssSelector(".btn-success")).click();

// System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());



// }