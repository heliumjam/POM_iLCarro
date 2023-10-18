package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    String city = "Tel Aviv";
    int dateFrom = 3;
    int dateTo = 10;

    @BeforeMethod
    public void checkLogout() {
        if (loginPage.isPopUpErrorOpen()) {
            loginPage.clickOkPopUp();
            searchPage.clickBackBTNPhone();
        }
    }

    @Test
    public void testSearchFormPositive() {
        searchResultPage = searchPage.fillSearchForm(city, dateFrom, dateTo);
        Assert.assertTrue(searchResultPage.validateTitle());
    }
}



