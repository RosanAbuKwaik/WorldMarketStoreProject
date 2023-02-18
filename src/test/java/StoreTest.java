import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class StoreTest {

    public static ChromeDriver driver;
    public static WebDriverWait wait;
    @Test
    public  static void setUpCart() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 60);
        driver.get("https://www.worldmarket.com/product/bleached-ivory-basket-weave-jute-rug.do?sortby=ourPicks&from=fn");
    }
    @Test(priority = 1)
    public void  VerifythatStoreProductImageIsDisplayed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(CartPOM.getStoreProductImage()));
        assertTrue(CartPOM.getStoreProductImage().isDisplayed());
    }


    @Test(priority = 2)
    public void  VerifythatStoreProducttitleIsDisplayed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(CartPOM.getStoreProductTitle()));
        assertTrue(CartPOM.getStoreProductTitle().isDisplayed());
    }

    @Test(priority = 1)
    public void  VerifythatAddtocartButtonIsDisplayed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(CartPOM.getAddtoCartProduct()));
        assertTrue(CartPOM.getAddtoCartProduct().isDisplayed());
    }


}
