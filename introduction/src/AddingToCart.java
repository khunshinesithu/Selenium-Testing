import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingToCart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String[] itemsNeedeed = {"Cucumber","Brocolli","Beetroot"};
        
        addItems(driver, itemsNeedeed);
        //click on cart button
        driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
        //click on proceed to checkout button
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        //enter promo code
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        
        //click on apply button
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
        
        //check the promo code message
        System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
        //place order
        driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
    }

    public static void addItems(WebDriver driver, String[] itemsNeeded){
        int j=0;
        //getting all the products because they all have the same class name
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for(int i=0; i<products.size(); i++){
            //getting the text of a product
            String[] product = products.get(i).getText().split("-");
            String formattedName = product[0].trim();

            //convert the item to buy array to list for faster processing
            List itemsNeededList = Arrays.asList(itemsNeeded);
            if(itemsNeededList.contains(formattedName)){
                j++;
                //click on Add to cart button of the index of the cucumber product in the list of all add to catr buttons
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if(j==itemsNeeded.length){
                    break;
                }
            }
        }
    }
}
