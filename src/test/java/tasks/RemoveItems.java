package tasks;

import actions.drag.Drag;
import actions.find.Find;
import actions.tap.Tap;
import actions.wait.WaitAtLeast;
import org.openqa.selenium.By;

import static actions.drag.DragDirection.LEFT;
import static stepsdefinition.Hooks.getDriver;
import static userinterfaces.CheckoutPage.BTN_DELETE_ITEM;
import static userinterfaces.CheckoutPage.theProductOnPurchasingCart;

public class RemoveItems {
    public static void fromPurchasingCart(String productToRemove) {
        By theElement = theProductOnPurchasingCart(productToRemove);
        Find.theElement(theElement).toBottom().untilMaxAttepmts(5).release().perform();
        Drag.theElement(theElement).to(LEFT).withTheDriver(getDriver()).release().perform();
        WaitAtLeast.seconds(2).forTheElement(BTN_DELETE_ITEM).toBeVisible();
        Tap.theElement(BTN_DELETE_ITEM).release().perform();
    }
}
