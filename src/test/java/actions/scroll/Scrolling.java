package actions.scroll;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebDriver;

public class Scrolling {
    private WebDriver driver;
    private boolean toBottom;
    private int timeout;

    public Scrolling() {
        this.driver = null;
        this.timeout = 1;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setToBottom(boolean toBottom) {
        this.toBottom = toBottom;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public void perform() {
        var dimension = driver.manage().window().getSize();
        int xPosition = dimension.width / 2;
        int initialPositionY = dimension.height / 2;
        int finalPositionY = toBottom ? (dimension.height / 4) : (dimension.height - dimension.height / 4);
        TouchAction<?> action = new TouchAction((AppiumDriver<?>) driver);
        var timeExecution = 0;
        while (timeExecution <= timeout) {
            action.longPress(PointOption.point(xPosition, initialPositionY));
            action.moveTo(PointOption.point(xPosition, finalPositionY));
            action.release().perform();
            timeExecution++;
        }
    }
}