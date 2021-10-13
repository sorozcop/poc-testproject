package userinterfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ProductsListPage {
    public static final By BTN_SHOPPING_CART = MobileBy.AccessibilityId("test-Carrito");

    public static By btnAddTheProduct(String productName) {
        return MobileBy.xpath("//*[@content-desc='test-Titulo de articulo' and @text='"
                .concat(productName)
                .concat("']/following::*[@content-desc='test-AÑADIR A CARRITO']"));
    }
}