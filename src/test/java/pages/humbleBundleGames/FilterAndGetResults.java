package pages.humbleBundleGames;

import pages.Common;
import pages.Locators;

public class FilterAndGetResults {

    public static void open() {
        pages.Common.openUrl("https://www.humblebundle.com/store/search?sort=bestselling&hmb_source=navbar");
    }

    public static void hoverOverFilter(){
        Common.clickElementByAction(Locators.GamesSection.hoverOverFilter);
}
    public static void selectOptionNewReleases(){
        Common.clickElement(Locators.GamesSection.selectFromDropDown);
    }

    public static String isResultMoreThenZero() {
        return Common.getElementText(Locators.GamesSection.fieldResultsNewReleases);
    }
}
