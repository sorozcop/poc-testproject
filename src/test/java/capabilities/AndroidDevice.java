package capabilities;

import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.android.AndroidDriver;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;
import static io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME;
import static io.appium.java_client.remote.MobileCapabilityType.PLATFORM_VERSION;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class AndroidDevice implements MobileCapabilities {

    public static DriverBuilder getDriverCapabilities() {
        capabilities.setCapability(PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(PLATFORM_VERSION, "7.0");
        capabilities.setCapability(DEVICE_NAME, "TP704A");
        //utils.capabilities.setCapability(APP, "resources/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
        capabilities.setCapability(APP_PACKAGE, "com.swaglabsmobileapp");
        capabilities.setCapability(APP_ACTIVITY, "com.swaglabsmobileapp.MainActivity");
        return new DriverBuilder<AndroidDriver>(capabilities)
                .withProjectName("PoC-SauceLabs-Android")
                .withJobName("PoC-SauceLabs-Android")
                .withToken(System.getenv("DEVELOPMENT_TOKEN"));
    }
}
