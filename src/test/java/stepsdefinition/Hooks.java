package stepsdefinition;

import capabilities.AndroidDevice;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static final int STANDARD_TIMEOUT = 5;
    private static AndroidDriver<MobileElement> driver;

    @Before
    public static void driverSetUp() {
        DriverBuilder<AndroidDriver> driverBuilder = AndroidDevice.getDriverCapabilities();
        driver = (AndroidDriver<MobileElement>) driverBuilder.build(AndroidDriver.class);
        driver.manage().timeouts().implicitlyWait(STANDARD_TIMEOUT, TimeUnit.SECONDS);
        driver.resetApp();
    }

    public static AndroidDriver<MobileElement> getDriver() {
        return driver;
    }

    @After
    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}