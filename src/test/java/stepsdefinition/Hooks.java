package stepsdefinition;

import capabilities.AndroidDevice;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.testproject.sdk.drivers.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static final int STANDARD_TIMEOUT = 5;
    private static AndroidDriver<? extends MobileElement> driver;

    @Before(order = 1)
    public static void driverSetUp() {
        driver = AndroidDevice.getAndroidDriver();
        driver.manage().timeouts().implicitlyWait(STANDARD_TIMEOUT, TimeUnit.SECONDS);
        driver.resetApp();
    }

    public static AndroidDriver<? extends MobileElement> getDriver() {
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