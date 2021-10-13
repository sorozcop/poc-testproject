package tasks;

import actions.find.Find;

import static userinterfaces.CheckoutPage.BTN_CHECKOUT;
import static userinterfaces.CheckoutPage.BTN_CONTINUE;
import static userinterfaces.CheckoutPage.BTN_TERMINATE;
import static userinterfaces.CheckoutPage.INPUT_LAST_NAME;
import static userinterfaces.CheckoutPage.INPUT_NAME;
import static userinterfaces.CheckoutPage.INPUT_POSTAL_CODE;

public class Checkout {
    public static void process() {
        GoToShopping.cart();
        Find.theElement(BTN_CHECKOUT).toBottom().release().perform().click();
        Find.theElement(INPUT_NAME).toBottom().release()
                .perform().sendKeys("Sebastián");
        Find.theElement(INPUT_LAST_NAME).toBottom().release()
                .perform().sendKeys("Orozco");
        Find.theElement(INPUT_POSTAL_CODE).toBottom().release()
                .perform().sendKeys("03300");
        Find.theElement(BTN_CONTINUE).toBottom().release().perform().click();
        Find.theElement(BTN_TERMINATE).toBottom().release().perform().click();
    }
}
