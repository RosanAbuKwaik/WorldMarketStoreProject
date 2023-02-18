
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;



public class MainPageTest {
    @Test(priority = 1)
    public void verifyPopupIsDisplayed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(SignUpPOM.getPopup()));
        assertTrue(SignUpPOM.getPopup().isDisplayed());
    }
    @Test(priority = 1)
    public void verifySignINButtonIsDisplayed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(MainPOM.getSignInButtonIsDisplayed()));
        assertTrue(MainPOM.getSignInButtonIsDisplayed().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyClosePopupIsclosed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(MainPOM.getClosePopup()));
        assertTrue(MainPOM.getClosePopup().isDisplayed());
        MainPOM.getClosePopup().click();
    }
   // @Test(priority = 3)
   // public void verifythatWishListIsDisplayed() {
     //   Setup.wait.until(ExpectedConditions.elementToBeClickable(MainPOM.getWishlistIsDisplayed()));
       // assertTrue(MainPOM.getWishlistIsDisplayed().isDisplayed());
    //}

    @Test(priority = 4)
    public void  VerifythatCartIsDisplayed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(MainPOM.getCartIsDisplayed()));
        assertTrue(MainPOM.getCartIsDisplayed().isDisplayed());
    }
    @Test(priority = 5)
    public void  VerifythatCartIsOpened() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(MainPOM.getCartIsDisplayed()));
        MainPOM.getCartIsDisplayed().click();
        Assert.assertTrue(MainPOM.getCartOpensCard().isDisplayed());

    }

    @Test(priority = 6)
    public void  VerifythatCartProductIsDisplayed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(MainPOM.getProductCartInTheCart()));
        assertTrue(MainPOM.getProductCartInTheCart().isDisplayed());
    }

//    @Test(priority = 7)
//    public void  VerifythatDiscountSantaceIsDisplayed() {
//        Setup.wait.until(ExpectedConditions.elementToBeClickable(MainPOM.getDiscountSantaceInCart()));
//        Assert.assertEquals(MainPOM.getDiscountSantaceInCart().getText(), TestData.userData.discountinCart);
//        assertTrue(MainPOM.getDiscountSantaceInCart().isDisplayed());
//    }

    @Test(priority = 8)
    public void  VerifythatCheckOutButtonCartIsDisplayed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(MainPOM.getCheckOutCartButton()));
        assertTrue(MainPOM.getCheckOutCartButton().isDisplayed());
    }

    @Test(priority = 9)
    public void  VerifythatCartbuttonIsClosed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(MainPOM.getCloseButtonCard()));
        MainPOM.getCloseButtonCard().click();
//        Assert.assertTrue(MainPOM.getCloseButtonCard().isDisplayed());

    }




//
//    @Test(priority = 5)
//    public void verifyClickingOnSignInAddDataintheForm() {
//        Setup.wait.until(ExpectedConditions.elementToBeClickable(MainPOM.getEmailFieldSignIn()));
//        MainPOM.getEmailFieldSignIn().sendKeys(TestData.userData.email);
//
//        MainPOM.getPasswordFieldSignIn().sendKeys(TestData.userData.password);
//        MainPOM.getSendSignInFormButtontField().click();
////        Setup.wait.until(ExpectedConditions.visibilityOf(JoinFormPOM.getSuccessLabel()));
////        Assert.assertEquals(JoinFormPOM.getSuccessLabel().getText(), TestData.NewSpecialistData.successMessage);
//    }






}





