package test.humbleBundle;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
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
        pages.Common.waitForElementToBeVisible(pages.Locators.HomePage.buttonViewAllResults);
        pages.humbleBundle.HomePageSearchDropDown.buttonNextSearchPage();

        try {
            pages.Common.waitForElementToBeVisible(pages.Locators.HomePage.buttonViewAllResults);
            String actualMessage = pages.humbleBundle.HomePageSearchDropDown.readSearchDropDownMessage();
            Assert.assertTrue(actualMessage.contains(expectedMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
