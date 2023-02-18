import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchBoxProductsTest {


    @Test(priority = 1)
    public void verifySignINButtonIsDisplayed() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(SearchPOM.getSearchBoxIsDisplayed()));
        assertTrue(SearchPOM.getSearchBoxIsDisplayed().isDisplayed());
    }

    @Test(priority = 2)
    public void verifySearchBoxClick() {
    Setup.wait.until(ExpectedConditions.elementToBeClickable(SearchPOM.getSearchBoxIsDisplayed()));
        SearchPOM.getSearchBoxIsDisplayed().click();
    }
    @Test(priority = 3)
    public void verifySearchBoxEnterData() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(SearchPOM.getSearchBoxIsDisplayed()));
        SearchPOM.getSearchBoxIsDisplayed().sendKeys(TestData.SearchData.search);
    }
    }
