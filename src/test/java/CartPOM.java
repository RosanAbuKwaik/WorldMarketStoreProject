import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPOM {


    public static WebElement getSHopNowIsdisplayed(){
        return Setup.driver.findElement(By.xpath("//*[@id='home_topnav_layout_15_fillslot-10']/a"));
    }

    public static WebElement getTitleofProduct(){
        return Setup.driver.findElement(By.xpath("//*[@id='home_topnav_layout_15_fillslot-10']/div[1]/h2"));
    }

    public static WebElement getIntroductionofProduct(){
        return Setup.driver.findElement(By.xpath("//*[@id='home_topnav_layout_15_fillslot-10']/div[2]"));
    }
    public static WebElement getImageofProduct(){
        return Setup.driver.findElement(By.xpath("//*[@id='home_topnav_layout_15_fillslot-10']/img[1]"));
    }
    public static WebElement getStoreProductImage(){
        return Setup.driver.findElement(By.xpath("//*[@id='mainimage']"));
    }

    public static WebElement getStoreProductTitle(){
        return Setup.driver.findElement(By.xpath("//*[@id='mainForm']/div[2]/div/div[2]/h1"));
    }
    public static WebElement getAddtoCartProduct() {
        return Setup.driver.findElement(By.xpath(" //*[@id='addToBasket463653']"));
    }
}
