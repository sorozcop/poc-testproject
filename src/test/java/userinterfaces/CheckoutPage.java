package userinterfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class CheckoutPage {
    public static final By BTN_CHECKOUT = MobileBy.AccessibilityId("test-CHECKOUT");
    public static final By INPUT_NAME = MobileBy.AccessibilityId("test-Nombre");
    public static final By INPUT_LAST_NAME = MobileBy.AccessibilityId("test-Apellido");
    public static final By INPUT_POSTAL_CODE = MobileBy.AccessibilityId("test-Código postal");
    public static final By BTN_CONTINUE = MobileBy.AccessibilityId("test-CONTINUAR");
    public static final By BTN_TERMINATE = MobileBy.AccessibilityId("test-TERMINAR");
    public static final By TXT_CONGRATS = MobileBy.xpath("//*[@text='GRACIAS POR SU ORDEN']");
    public static final By TXT_PROCESSED_ORDER = MobileBy.xpath("//*[@text='Su orden ha sido procesada y llegara cuanto antes!']");
    public static final By BTN_DELETE_ITEM = MobileBy.AccessibilityId("test-Delete");

    public static By theProductOnPurchasingCart(String productName) {
        return MobileBy.xpath("//*[@content-desc='test-Descripción']//following::*[contains(@text,'".concat(productName).concat("')]"));
    }

}