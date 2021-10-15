package actions.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static stepsdefinition.Hooks.getDriver;

public class WaitAtLeast {
    private final int timeout;
    private By byElement;

    private WaitAtLeast(int timeout) {
        this.timeout = timeout;
    }

    public static WaitAtLeast seconds(int timeout) {
        return new WaitAtLeast(timeout);
    }

    public WaitAtLeast forTheElement(By byElement) {
        this.byElement = byElement;
        return this;
    }

    public WebElement toBeVisible() {
        return new WebDriverWait(getDriver(), timeout)
                .until(ExpectedConditions.visibilityOfElementLocated(byElement));
    }

    public void isNotVisible() {
        new WebDriverWait(getDriver(), timeout)
                .until(ExpectedConditions.invisibilityOfElementLocated(byElement));
    }

    public WebElement toBeClickable() {
        return new WebDriverWait(getDriver(), timeout)
                .until(ExpectedConditions.elementToBeClickable(byElement));
    }

    public void toBeEnabled() {
        new WebDriverWait(getDriver(), timeout)
                .until(ExpectedConditions.attributeToBe(byElement, "enabled", "true"));
    }
}