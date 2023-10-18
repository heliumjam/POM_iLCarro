package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/resultTitle']")
    MobileElement title;

    @FindBy(id = "com.telran.ilcarro:id/emptyTxt")
    MobileElement emptyTxt;


    public boolean validateTitle() {
        String expectedResult = "Search result".toUpperCase();
        String actualResult = getText(title, 15);
        if(expectedResult.equals(actualResult)) {
            return true;
        } else {
            System.out.println("Expected result: " + expectedResult +
                    " actual result: " + actualResult);
            return false;
        }
    }


}
