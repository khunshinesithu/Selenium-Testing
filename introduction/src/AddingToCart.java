import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingToCart {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        
        String[] itemsNeedeed = {"Cucumber","Brocolli","Beetroot"};
        int j=0;
        //getting all the products because they all have the same class name
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for(int i=0; i<products.size(); i++){
            //getting the text of a product
            String[] product = products.get(i).getText().split("-");
            String formattedName = product[0].trim();

            //convert the item to buy array to list for faster processing
            List itemsNeedeedList = Arrays.asList(itemsNeedeed);
            if(itemsNeedeedList.contains(formattedName)){
                j++;
                //click on Add to cart button of the index of the cucumber product in the list of all add to catr buttons
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if(j==itemsNeedeed.length){
                    break;
                }
            }
        }

    }
}
