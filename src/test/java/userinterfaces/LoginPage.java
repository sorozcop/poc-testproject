package userinterfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginPage {
    public static final By INPUT_USERNAME = MobileBy.AccessibilityId("test-Usuario");
    public static final By INPUT_PASSWORD = MobileBy.AccessibilityId("test-Contraseña");
    public static final By BTN_LOGIN = MobileBy.AccessibilityId("test-LOGIN");
}
