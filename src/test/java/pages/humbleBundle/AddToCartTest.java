package pages.humbleBundle;

import pages.Common;
import pages.Locators;

public class AddToCartTest {

    public static void inputTextIntoSearchBox(String expectedMessage) {
        pages.Common.sendKeysToElement(
                Locators.HomePage.inputSearchMessage, expectedMessage);
    }

    public static void clickFirstResult() {
        pages.Common.clickElement(Locators.HomePage.firstResultClick);
    }

    public static void clickAddToCart() {
        pages.Common.clickElement(Locators.HomePage.clickAddToCart);
    }

    public static String fieldCartItemTotal() {
        return Common.getElementText(Locators.HomePage.fieldCartItemNumber);
    }
}
