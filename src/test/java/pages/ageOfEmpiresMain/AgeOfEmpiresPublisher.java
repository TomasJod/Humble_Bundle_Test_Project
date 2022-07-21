package pages.ageOfEmpiresMain;

import pages.Common;
import pages.Locators;

public class AgeOfEmpiresPublisher {

    public static void open() {
        pages.Common.openUrl("https://www.humblebundle.com/store/age-of-empires-iii-definitive-edition");
    }

    public static void clickPublisher() {
        Common.clickElement(Locators.AgeOfEmpiresPublisher.buttonPublisherName);
    }

    public static void clickAnotherGame() {
        Common.clickElement(Locators.AgeOfEmpiresPublisher.buttonFirstGameInList);
    }

    public static String fieldPublisher() {
        return Common.getElementText(Locators.AgeOfEmpiresPublisher.fieldPublisherName);
    }
}
