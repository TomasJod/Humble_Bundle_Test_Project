package pages.humbleBundle;

import pages.Locators;
import utils.Constants;

public class HomePageSearchViewAll {

    public static void open() {
        pages.Common.openUrl("https://www.humblebundle.com/?hmb_source=navbar");
    }

    public static void inputTextIntoSearchBox(String expectedMessage) {
        pages.Common.sendKeysToElement(
                Locators.HomePage.inputSearchMessage, expectedMessage);
    }

    public static void clickViewAllResults() {
        pages.Common.clickElement(Locators.HomePage.buttonViewAllResults);
    }

    public static String readSearchMessage() {
        return pages.Common.getElementText(Locators.HomePage.fieldSearchViewAllResults);
    }

}
