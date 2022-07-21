package test.humbleBundle;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import pages.Locators;
import test.BaseTest;

public class HomePageSearchDropDown extends BaseTest {

    @BeforeMethod
    @Override
    public void startUp() {
        super.startUp();
        pages.humbleBundle.HomePageSearchViewAll.open();
    }

    @Test

    public void testSearchDropDownResult() {

        String expectedMessage = "Lego";


        pages.humbleBundle.HomePageSearchDropDown.inputTextIntoSearchBox(expectedMessage);
        Common.waitForElementToBeVisible(Locators.HomePage.buttonViewAllResults);
        pages.humbleBundle.HomePageSearchDropDown.buttonNextSearchPage();

        try {
            Common.waitForElementToBeVisible(Locators.HomePage.buttonViewAllResults);
            String actualMessage = pages.humbleBundle.HomePageSearchDropDown.readSearchDropDownMessage();
            Assert.assertTrue(actualMessage.contains(expectedMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
