package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.Driver;
import utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    @BeforeMethod
    public void startUp() {
        Driver.setDriver();

    }

    @AfterMethod
    public void teardown() {

        Driver.closeDriver();

    }
}
