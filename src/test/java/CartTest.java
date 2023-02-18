import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CartTest {
    @Test(priority = 1)
    public void  VerifythatCartShopNowIsDisplayed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(CartPOM.getSHopNowIsdisplayed()));
        assertTrue(CartPOM.getSHopNowIsdisplayed().isDisplayed());
    }
    @Test(priority = 2)
    public void  VerifythatProductTitleIsDisplayed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(CartPOM.getTitleofProduct()));
        assertTrue(CartPOM.getTitleofProduct().isDisplayed());
    }
    @Test(priority = 3)
    public void  VerifythatProductIntroductionIsDisplayed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(CartPOM.getIntroductionofProduct()));
        assertTrue(CartPOM.getIntroductionofProduct().isDisplayed());
    }
    @Test(priority = 4)
    public void  VerifythatProductImageIsDisplayed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(CartPOM.getImageofProduct()));
        assertTrue(CartPOM.getImageofProduct().isDisplayed());
    }
    @Test(priority = 5)
    public void  VerifythatCartShopNowOpensCartPage() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(CartPOM.getSHopNowIsdisplayed()));
        assertTrue(CartPOM.getSHopNowIsdisplayed().isDisplayed());
        CartPOM.getSHopNowIsdisplayed().click();
    }

}
