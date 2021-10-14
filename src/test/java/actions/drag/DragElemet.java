package actions.drag;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.logging.Level;

import static io.appium.java_client.touch.offset.PointOption.point;
import static java.util.logging.Logger.getAnonymousLogger;
import static userinterfaces.Pages.getTheElement;

public class DragElemet {
    private By byElement;
    private DragDirection direction;
    private WebDriver driver;

    public DragElemet() {
        this.byElement = null;
        this.direction = null;
        this.driver = null;
    }

    public void setByElement(By byElement) {
        this.byElement = byElement;
    }

    public void setDirection(DragDirection direction) {
        this.direction = direction;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    private PointOption<?> withFinalPosition(Point elementPosition) {
        PointOption<?> finalPoint;
        var driverDimension = driver.manage().window().getSize();
        switch (direction) {
            case UP:
                finalPoint = point(elementPosition.getX(), 0);
                break;
            case DOWN:
                finalPoint = point(elementPosition.getX(), driverDimension.getHeight());
                break;
            case LEFT:
                finalPoint = point(0, elementPosition.getY());
                break;
            case RIGHT:
                finalPoint = point(driverDimension.getWidth(), elementPosition.getY());
                break;
            default:
                throw new IllegalArgumentException("dragElement(): direction: '" + direction + "' NOT supported");
        }
        return finalPoint;
    }

    public void perform() {
        Point elementPosition = getTheElement(byElement).getLocation();
        PointOption<?> destinyPoint = withFinalPosition(elementPosition);
        TouchAction<?> touchAction = new TouchAction<>((AppiumDriver<?>) driver);
        try {
            touchAction.press(point(elementPosition))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .moveTo(destinyPoint)
                    .release().perform();
        } catch (Exception e) {
            getAnonymousLogger().log(Level.INFO, "TouchAction DragElement FAILED\n on element: ".concat(byElement.toString()), e.getLocalizedMessage());
        }
    }
}