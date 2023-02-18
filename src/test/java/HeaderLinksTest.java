import org.example.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class HeaderLinksTest {
    @Test(priority = 1)
    public void verifyThatMainPageIsDisplyed() {
        WebElement imagesection = Setup.driver.findElement(By.xpath("//*[@id='slider-container']/div/div/div/div/a/div/div"));
        assertTrue(imagesection.isDisplayed());
    }

    @Test(priority = 2)
    public void verifyThatFurnitureIsDisplayed() {
        WebElement furnitureSection = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-1']"));
        assertTrue(furnitureSection.isDisplayed());
    }

    @Test(priority = 2)
    public void verifyThatFurnitureIsOpensTheFurniturePage() {
        WebElement furniturebutton = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-1']"));
        furniturebutton.click();
    }
    @Test(priority = 3)
    public void verifyThatOutDoorIsDisplayed() {
        WebElement outdoor = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-outdoor-1']"));
        assertTrue(outdoor.isDisplayed());
    }

    @Test(priority = 4)
    public void verifyThatOutDoorOpensDropDownList() {
        WebElement outdoor = Setup.driver.findElement(By.id("ml-accessible-megamenu-outdoor-1"));
//        outdoor.click();
        Actions builder = new Actions(Setup.driver);
        builder.moveToElement(outdoor).perform();
    }
    @Test(priority = 5)
    public void verifyThatRugsIsDisplayed() {
        WebElement outdoor = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-rugs-1']"));
        assertTrue(outdoor.isDisplayed());
    }

    @Test(priority = 6)
    public void verifyThatRugsOpensDropDownList() {
        WebElement rugs = Setup.driver.findElement(By.id("ml-accessible-megamenu-rugs-1"));

        Actions builder = new Actions(Setup.driver);
        builder.moveToElement(rugs).perform();
    }

    @Test(priority = 7)
    public void verifyThatDecorIsDisplayed() {
        WebElement decors = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-decor-pillows-1']"));
        assertTrue(decors.isDisplayed());
    }

    @Test(priority = 8)
    public void verifyThatDecoreOpensDropDownList() {
        WebElement decors = Setup.driver.findElement(By.id("ml-accessible-megamenu-decor-pillows-1"));
        Actions builder = new Actions(Setup.driver);
        builder.moveToElement(decors).perform();
    }

    @Test(priority = 9)
    public void verifyThatLightingIsDisplayed() {
        WebElement ligthing= Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-lighting-1']"));
        assertTrue(ligthing.isDisplayed());
    }

    @Test(priority = 10)
    public void verifyThatLigtingOpensDropDownList() {
        WebElement ligthing = Setup.driver.findElement(By.id("ml-accessible-megamenu-lighting-1"));
        Actions builder = new Actions(Setup.driver);
        builder.moveToElement(ligthing).perform();
    }


    @Test(priority = 11)
    public void verifyThatWallDecoreandMirrorsIsDisplayed() {
        WebElement decore = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-wall-decor-mirrors-1']"));
        assertTrue(decore.isDisplayed());
    }

    @Test(priority = 12)
    public void verifyThatWallDecoreandMirrorsOpensDropDownList() {
        WebElement decore = Setup.driver.findElement(By.id("ml-accessible-megamenu-wall-decor-mirrors-1"));
        Actions builder = new Actions(Setup.driver);
        builder.moveToElement(decore).perform();
    }


    @Test(priority = 13)
    public void verifyThatKitchenIsDisplayed() {
        WebElement kitchen = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-kitchen-1']"));
        assertTrue(kitchen.isDisplayed());
    }

    @Test(priority = 14)
    public void verifyThatKitchenOpensDropDownList() {
        WebElement kitchen = Setup.driver.findElement(By.id("ml-accessible-megamenu-kitchen-1"));
        Actions builder = new Actions(Setup.driver);
        builder.moveToElement(kitchen).perform();
    }


    @Test(priority = 15)
    public void verifyThatDiningIsDisplayed() {
        WebElement dining = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-dining-1']"));
        assertTrue(dining.isDisplayed());
    }

    @Test(priority = 16)
    public void verifyThatDiningOpensDropDownList() {
        WebElement dining = Setup.driver.findElement(By.id("ml-accessible-megamenu-dining-1"));
        Actions builder = new Actions(Setup.driver);
        builder.moveToElement(dining).perform();
    }
    @Test(priority = 17)
    public void verifyThatFoodandDrinkIsDisplayed() {
        WebElement food = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-food-and-drink-1']"));
        assertTrue(food.isDisplayed());
    }

    @Test(priority = 18)
    public void verifyThatFoodandDrinkpensDropDownList() {
        WebElement food = Setup.driver.findElement(By.id("ml-accessible-megamenu-food-and-drink-1"));
        Actions builder = new Actions(Setup.driver);
        builder.moveToElement(food).perform();
    }
    @Test(priority = 19)
    public void verifyThaGiftsIsDisplayed() {
        WebElement gifts = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-gifts-1']"));
        assertTrue(gifts.isDisplayed());
    }

    @Test(priority = 20)
    public void verifyThatGiftspensDropDownList() {
        WebElement gifts = Setup.driver.findElement(By.id("ml-accessible-megamenu-gifts-1"));
        Actions builder = new Actions(Setup.driver);
        builder.moveToElement(gifts).perform();
    }

    @Test(priority = 21)
    public void verifyThaIsHolidaysDisplayed() {
        WebElement holiday = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-holiday-1']"));
        assertTrue(holiday.isDisplayed());
    }

    @Test(priority = 22)
    public void verifyThatHolidayspensDropDownList() {
        WebElement holiday = Setup.driver.findElement(By.id("ml-accessible-megamenu-holiday-1"));
        Actions builder = new Actions(Setup.driver);
        builder.moveToElement(holiday).perform();
    }
    @Test(priority = 23)
    public void verifyThatSalesIsDisplayed() {
        WebElement sales = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-sale-1']"));
        assertTrue(sales.isDisplayed());
    }

    @Test(priority = 24)
    public void verifyThatSalesopensDropDownList() {
        WebElement sales = Setup.driver.findElement(By.id("ml-accessible-megamenu-sale-1"));
        Actions builder = new Actions(Setup.driver);
        builder.moveToElement(sales).perform();
    }
    @Test(priority = 25)
    public void verifyThatInseprtionIsDisplayed() {
        WebElement inspretion = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-inspiration-1']"));
        assertTrue(inspretion.isDisplayed());
    }

    @Test(priority = 26)
    public void verifyThatInseprtionopensDropDownList() {
        WebElement inspretion = Setup.driver.findElement(By.id("ml-accessible-megamenu-inspiration-1"));
        Actions builder = new Actions(Setup.driver);
        builder.moveToElement(inspretion).perform();
    }
    @Test(priority = 27)
    public void verifyThatShopNowButtonIsDisplayed() {
        WebElement shop = Setup.driver.findElement(By.xpath("//*[@id='home_topnav_layout_15_fillslot-7']/a/div"));
        assertTrue(shop.isDisplayed());
    }
    @Test(priority = 28)
    public void verifyThatSelectYourStoreIsDisplayed() {
        WebElement shop = Setup.driver.findElement(By.xpath("//*[@id='selectStoreDialogLink']"));
        assertTrue(shop.isDisplayed());
    }
    @Test(priority = 29)
    public void verifyThatSelectYourStoreIsOpenPopUp() {
        MainPOM.getSelectyourStoreButton().click();
        MainPOM.getSelectyourStoreDialogBox().isDisplayed();
    }
    @Test(priority = 30)
    public void verifyClosePopupIsclosed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(MainPOM.getSelectYourStoreClosePopup()));
        assertTrue(MainPOM.getSelectYourStoreClosePopup().isDisplayed());
        MainPOM.getSelectYourStoreClosePopup().click();
    }

}
