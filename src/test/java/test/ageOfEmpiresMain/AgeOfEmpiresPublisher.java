package test.ageOfEmpiresMain;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.BaseTest;

public class AgeOfEmpiresPublisher extends BaseTest {
    @BeforeMethod
    @Override
    public void startUp() {
        super.startUp();
        pages.ageOfEmpiresMain.AgeOfEmpiresPublisher.open();
    }

    @Test
    public void testPublishedBy() {
        String expectedMessage = "Xbox Game Studios";

        pages.ageOfEmpiresMain.AgeOfEmpiresPublisher.clickPublisher();
        pages.ageOfEmpiresMain.AgeOfEmpiresPublisher.clickAnotherGame();
        String actualMessage = pages.ageOfEmpiresMain.AgeOfEmpiresPublisher.fieldPublisher();

        Assert.assertTrue(actualMessage.contains(expectedMessage));


    }
}
