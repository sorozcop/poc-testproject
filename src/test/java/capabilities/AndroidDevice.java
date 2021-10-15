package capabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;

public class AndroidDevice implements MobileCapabilities {

    public static AndroidDriver<? extends MobileElement> getAndroidDriver() {
        capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, "true");
        capabilities.setCapability(CapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        capabilities.setCapability(MobileCapabilityType.UDID, "B50046F1ZJ8B1300BE");
        capabilities.setCapability(MobileCapabilityType.APP, "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.swaglabsmobileapp");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.swaglabsmobileapp.MainActivity");
        DriverBuilder<AndroidDriver> driverBuilder = new DriverBuilder<AndroidDriver>(capabilities)
                .withProjectName("PoC-SauceLabs-Android")
                .withJobName("PoC-SauceLabs-Android")
                .withToken(System.getenv("DEVELOPMENT_TOKEN"));
        return driverBuilder.build(AndroidDriver.class);
    }
}
