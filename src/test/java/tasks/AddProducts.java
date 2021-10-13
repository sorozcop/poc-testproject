package tasks;

import actions.find.Find;

import static userinterfaces.ProductsListPage.btnAddTheProduct;

public class AddProducts {
    public static void toPurchasingCart() {
        Find.theElement(btnAddTheProduct("Luz de bicicleta Sauce Labs"))
                .toBottom().release().perform().click();
        Find.theElement(btnAddTheProduct("Camisa Sauce Labs Bolt"))
                .toTop().release().perform().click();
        Find.theElement(btnAddTheProduct("Mochila Sauce Labs"))
                .toBottom().release().perform().click();
    }
}
