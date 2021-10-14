package assertions;

import actions.find.Find;
import org.junit.Assert;
import org.openqa.selenium.By;

import static userinterfaces.CheckoutPage.theProductOnPurchasingCart;
import static userinterfaces.Pages.getTheElement;

public class PurchasingCart {
    public static void mustNotShow(String removedProductName) {
        By theElement = theProductOnPurchasingCart(removedProductName);
        Find.theElement(theElement).toBottom().release().perform();
        Assert.assertNull(getTheElement(theElement));
    }
}
