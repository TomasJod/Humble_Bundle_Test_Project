package test.humbleBundleGames;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.BaseTest;

public class FilterAndGetResults extends BaseTest {
    @BeforeMethod
    @Override
    public void startUp() {
        super.startUp();
        pages.humbleBundleGames.FilterAndGetResults.open();
    }

    @Test

    public void filterGamesByNewReleases() {
        String actualMessage;

        pages.humbleBundleGames.FilterAndGetResults.hoverOverFilter();
        pages.humbleBundleGames.FilterAndGetResults.selectOptionNewReleases();
        pages.Common.waitForElementToBeVisible(pages.Locators.GamesSection.fieldResultsNewReleases);
        actualMessage = pages.humbleBundleGames.FilterAndGetResults.isResultMoreThenZero();

        Assert.assertNotNull(actualMessage);
    }
}
