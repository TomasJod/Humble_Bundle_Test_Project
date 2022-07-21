package pages.humbleBundle;

import pages.Locators;

public class HomePageSearchDropDown {

    public static void inputTextIntoSearchBox(String expectedMessage) {
        pages.Common.sendKeysToElement(
                Locators.HomePage.inputSearchMessage, expectedMessage);
    }

    public static String readSearchDropDownMessage() {
        return pages.Common.getElementText(Locators.HomePage.fieldSearchDropDownResults);
    }
}
