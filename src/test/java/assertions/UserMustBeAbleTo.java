package assertions;

import actions.wait.WaitAtLeast;
import org.junit.Assert;
import stepsdefinition.Hooks;

import static userinterfaces.Pages.getTheElement;
import static userinterfaces.WebviewPage.BTN_GOOGLE_SEARCH;
import static userinterfaces.WebviewPage.INPUT_GOOGLE_SEARCH;
import static userinterfaces.WebviewPage.LBL_GOOGLE_RESULTS;
import static userinterfaces.WebviewPage.WEBVIEW_CONTAINER;

public class UserMustBeAbleTo {
    public static void InteractWithWebView() {
        WaitAtLeast.seconds(30).forTheElement(WEBVIEW_CONTAINER).toBeEnabled();
        Hooks.getDriver().context("WEBVIEW_com.swaglabsmobileapp");
        WaitAtLeast.seconds(30).forTheElement(INPUT_GOOGLE_SEARCH).toBeVisible().sendKeys("Somos Devco");
        getTheElement(BTN_GOOGLE_SEARCH).click();
        WaitAtLeast.seconds(5).forTheElement(LBL_GOOGLE_RESULTS).toBeVisible().click();
        Assert.assertTrue(getTheElement(LBL_GOOGLE_RESULTS).isDisplayed());
        Hooks.getDriver().context("NATIVE_APP");
    }
}