package assertions;

import actions.find.Find;

import static userinterfaces.CheckoutPage.TXT_CONGRATS;
import static userinterfaces.CheckoutPage.TXT_PROCESSED_ORDER;

public class MustSeeCongrats {
    public static void message() {
        Find.theElement(TXT_CONGRATS).toBottom().release().perform().isDisplayed();
        Find.theElement(TXT_PROCESSED_ORDER).toBottom().release().perform().isDisplayed();
    }
}
