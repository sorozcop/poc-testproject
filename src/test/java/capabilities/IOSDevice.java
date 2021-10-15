package capabilities;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.ios.IOSDriver;
import org.openqa.selenium.remote.CapabilityType;

import static io.appium.java_client.remote.IOSMobileCapabilityType.BUNDLE_ID;

public class IOSDevice implements MobileCapabilities {

    public static IOSDriver getIOSDriver() {
        capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, "true");
        capabilities.setCapability(CapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
        capabilities.setCapability(MobileCapabilityType.UDID, "");
        capabilities.setCapability(MobileCapabilityType.APP, "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/iOS.RealDevice.SauceLabs.Mobile.Sample.app.2.7.1.ipa");
        capabilities.setCapability(BUNDLE_ID, "");
        DriverBuilder<IOSDriver> driverBuilder = new DriverBuilder<IOSDriver>(capabilities)
                .withProjectName("PoC-SauceLabs-Android")
                .withJobName("PoC-SauceLabs-Android")
                .withToken(System.getenv("DEVELOPMENT_TOKEN"));
        return driverBuilder.build(IOSDriver.class);
    }
}