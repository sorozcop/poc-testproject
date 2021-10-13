package tasks;

import static userinterfaces.Pages.getTheElement;
import static userinterfaces.ProductsListPage.BTN_SHOPPING_CART;

public class GoToShopping {
    public static void cart() {
        getTheElement(BTN_SHOPPING_CART).click();
    }
}
