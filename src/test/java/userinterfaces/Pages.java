package userinterfaces;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepsdefinition.Hooks;

import java.util.logging.Level;

import static java.util.logging.Logger.getAnonymousLogger;

public class Pages {
    public static WebElement getTheElement(By elementBy) {
        try {
            return Hooks.getDriver().findElement(elementBy);
        } catch (Exception ex) {
            getAnonymousLogger().log(Level.INFO, "Element not found: " + elementBy.toString(), ex.getLocalizedMessage());
        }
        return null;
    }
}
