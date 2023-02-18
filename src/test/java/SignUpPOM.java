import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpPOM {

    public static WebElement getPopup(){
        return   Setup.driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']\n"));
    }












}
