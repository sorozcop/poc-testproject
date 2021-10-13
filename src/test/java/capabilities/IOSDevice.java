package capabilities;

import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.ios.IOSDriver;

import static io.appium.java_client.remote.IOSMobileCapabilityType.BUNDLE_ID;
import static io.appium.java_client.remote.MobileCapabilityType.APP;
import static io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME;
import static io.appium.java_client.remote.MobileCapabilityType.PLATFORM_VERSION;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class IOSDevice implements MobileCapabilities {

    public static DriverBuilder getDriverCapabilities() {
        capabilities.setCapability(PLATFORM_NAME, MobilePlatform.IOS);
        capabilities.setCapability(PLATFORM_VERSION, "");
        capabilities.setCapability(DEVICE_NAME, "");
        capabilities.setCapability(APP, "");
        capabilities.setCapability(BUNDLE_ID, "");
        return new DriverBuilder<IOSDriver>(capabilities)
                .withProjectName("PoC-SauceLabs-Android")
                .withJobName("PoC-SauceLabs-Android")
                .withToken(System.getenv("DEVELOPMENT_TOKEN"));
    }
}