import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPOM {
    public static WebElement getSignInButtonIsDisplayed(){
        return Setup.driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div[4]/div[2]/div[15]/div[1]"));
    }
//    public static WebElement getWishlistIsDisplayed(){
//        return Setup.driver.findElement(By.xpath("//*[@id='showWishHeader']"));
//    }

    public static WebElement getCartIsDisplayed(){
        return Setup.driver.findElement(By.xpath("//div[@id='globalBasket']"));
    }
    public static WebElement getClosePopup(){
        return Setup.driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
    }
    public static WebElement getSelectYourStoreClosePopup(){
        return Setup.driver.findElement(By.xpath("//*[@id='idChangeStoreModal']/div/div/div[1]/div/button"));
    }

    public static WebElement getSignInbutton(){
        return Setup.driver.findElement(By.xpath("//div[@id='thSignIn']"));
    }
    public static WebElement getSignInOpensFormbutton(){
        return Setup.driver.findElement(By.xpath("//button[@type='button' and @class ='signInBtn']"));
    }

    public static WebElement getSignInForm(){
        return Setup.driver.findElement(By.xpath("//*[@id='ml-body-container']/main/div/div/div/div"));
    }
    public static WebElement getCartOpensCard(){
        return Setup.driver.findElement(By.xpath("//*[@id='sideCartRail']"));
    }

    public static WebElement getCloseButtonCard(){
        return Setup.driver.findElement(By.xpath(" //*[@id='sideCartRail']/div[2]/button"));
    }
    public static WebElement getProductCartInTheCart(){
        return Setup.driver.findElement(By.xpath("//*[@id='sideCartRail']/div[3]/div/div[1]/div[1]\n"));
    }
    public static WebElement getCheckOutCartButton(){
        return Setup.driver.findElement(By.xpath("//*[@id='sideCartRail']/div[3]/div/div[4]"));
    }
    public static WebElement getSelectyourStoreButton(){
        return Setup.driver.findElement(By.xpath("//*[@id='selectStoreDialogLink']"));
    }
    public static WebElement getSelectyourStoreDialogBox(){
        return Setup.driver.findElement(By.xpath("//*[@id='idChangeStoreModal']/div/div/div[1]/div/button"));
    }
    public static WebElement getDiscountSantaceInCart(){
        return  Setup.driver.findElement(By.xpath("//*[@id='sideCartRail']/div[3]/div/div[5]"));
    }

//    public static WebElement getProductPriceInTheCart(){
//        return Setup.driver.findElement(By.xpath("//*[@id="sideCartRail"]/div[3]/div/div[1]/div[1]/div/div/div[3]/div"));
//    }



}
