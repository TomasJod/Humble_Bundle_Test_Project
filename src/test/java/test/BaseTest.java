package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Driver;

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
