package tasks;

import actions.wait.WaitAtLeast;

import static userinterfaces.LoginPage.BTN_LOGIN;
import static userinterfaces.LoginPage.INPUT_PASSWORD;
import static userinterfaces.LoginPage.INPUT_USERNAME;
import static userinterfaces.Pages.getTheElement;

public class Login {
    public static void toPurchaseProducts() {
        WaitAtLeast.seconds(10).forTheElement(INPUT_USERNAME).toBeVisible().sendKeys("standard_user");
        getTheElement(INPUT_PASSWORD).sendKeys("secret_sauce");
        getTheElement(BTN_LOGIN).click();
    }
}