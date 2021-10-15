package tasks;

import actions.find.Find;
import actions.wait.WaitAtLeast;

import static userinterfaces.Pages.getTheElement;
import static userinterfaces.WebviewPage.BTN_GO_TO_SITE;
import static userinterfaces.WebviewPage.BTN_MENU;
import static userinterfaces.WebviewPage.BTN_WEBVIEW_OPTION;
import static userinterfaces.WebviewPage.INPUT_URL;

public class UseWebview {

    public static void toVisit(String url) {
        WaitAtLeast.seconds(10).forTheElement(BTN_MENU).toBeVisible().click();
        getTheElement(BTN_WEBVIEW_OPTION).click();
        getTheElement(INPUT_URL).sendKeys(url);
        Find.theElement(BTN_GO_TO_SITE).toBottom().release().perform().click();
    }
}
