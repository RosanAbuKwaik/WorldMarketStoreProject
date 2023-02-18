import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPOM {

    public static WebElement getSearchBoxIsDisplayed(){
        return Setup.driver.findElement(By.xpath("//*[@id='ml-body-container']/header/div[1]/div[6]/div/div/div/div[2]/div[5]/div/div/form"));
    }



}
