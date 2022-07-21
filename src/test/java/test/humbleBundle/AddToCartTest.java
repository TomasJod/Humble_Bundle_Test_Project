package test.humbleBundle;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import pages.Locators;
import test.BaseTest;

public class AddToCartTest extends BaseTest {

    @BeforeMethod
    @Override
    public void startUp() {
        super.startUp();
        pages.humbleBundle.HomePageSearchViewAll.open();
    }

    @Test

    public void addToCartCheckTest() {
        String expectedMessage = "Age of Empires III";
        String actualMessage;

        pages.humbleBundle.AddToCartTest.inputTextIntoSearchBox(expectedMessage);
        pages.humbleBundle.AddToCartTest.clickFirstResult();
        pages.humbleBundle.AddToCartTest.clickAddToCart();
        actualMessage = pages.humbleBundle.AddToCartTest.fieldCartItemTotal();

        Assert.assertTrue(actualMessage.contains("1"));

    }
}
