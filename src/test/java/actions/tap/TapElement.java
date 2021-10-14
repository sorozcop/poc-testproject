package actions.tap;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import java.util.logging.Level;

import static io.appium.java_client.touch.offset.PointOption.point;
import static java.util.logging.Logger.getAnonymousLogger;
import static stepsdefinition.Hooks.getDriver;
import static userinterfaces.Pages.getTheElement;

public class TapElement {
    private By byElement;

    public TapElement() {
        this.byElement = null;
    }

    public void setByElement(By byElement) {
        this.byElement = byElement;
    }

    public void perform() {
        WebElement theElement = getTheElement(byElement);
        Dimension elementDimension = theElement.getSize();
        Point elementPosition = theElement.getLocation();
        int midWidth = elementPosition.getX() + elementDimension.getWidth() / 2;
        int midHeight = elementPosition.getY() + elementDimension.getHeight() / 2;
        elementPosition = new Point(midWidth, midHeight);
        TouchAction<?> touchAction = new TouchAction<>(getDriver());
        try {
            touchAction.tap(point(elementPosition)).release().perform();
        } catch (Exception e) {
            getAnonymousLogger().log(Level.INFO, "TouchAction TAP has FAILED\n on element: ".concat(byElement.toString()), e.getLocalizedMessage());
        }
    }
}
