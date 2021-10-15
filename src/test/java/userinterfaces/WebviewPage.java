package userinterfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class WebviewPage {

    public static final By BTN_MENU = MobileBy.AccessibilityId("test-Menu");
    public static final By BTN_WEBVIEW_OPTION = MobileBy.AccessibilityId("test-WEBVIEW");
    public static final By INPUT_URL = MobileBy.AccessibilityId("test-Ingrese un URL...");
    public static final By BTN_GO_TO_SITE = MobileBy.AccessibilityId("test-IR A SITIO");


    public static final By INPUT_GOOGLE_SEARCH = By.xpath("//input[@title='Buscar']");
    public static final By BTN_GOOGLE_SEARCH = By.xpath("//input[@value = 'Buscar con Google']");
    public static final By LBL_GOOGLE_RESULTS = By.id("result-stats");
    public static final By WEBVIEW_CONTAINER = By.xpath("(//android.webkit.WebView)[1]");
}
