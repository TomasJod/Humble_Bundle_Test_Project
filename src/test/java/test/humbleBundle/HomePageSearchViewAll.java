package test.humbleBundle;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import pages.Locators;
import test.BaseTest;
import utils.Constants;

public class HomePageSearchViewAll extends BaseTest {

    @BeforeMethod
    @Override
    public void startUp() {
        super.startUp();
        pages.humbleBundle.HomePageSearchViewAll.open();
    }

    @Test
    public void testSearchFunction() {
        String expectedMessage = "BATMAN";


        pages.humbleBundle.HomePageSearchViewAll.inputTextIntoSearchBox(expectedMessage);
        Common.waitForElementToBeVisible(Locators.HomePage.buttonViewAllResults);

        pages.humbleBundle.HomePageSearchViewAll.clickViewAllResults();

        try {
            String actualMessage = pages.humbleBundle.HomePageSearchViewAll.readSearchMessage();
            Assert.assertTrue(actualMessage.contains(expectedMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
