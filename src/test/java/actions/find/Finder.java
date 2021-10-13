package actions.find;

import actions.scroll.Scroll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static stepsdefinition.Hooks.getDriver;
import static userinterfaces.Pages.getTheElement;

public class Finder {
    private By byElement;
    private Scroll actionScroll;

    public Finder() {
        this.byElement = null;
        WebDriver driver = (WebDriver) getDriver();
        this.actionScroll = Scroll.usingDriver(driver).untilMaxAttempts(1);
    }

    public void setByElement(By webElement) {
        this.byElement = webElement;
    }

    public void setToBottom() {
        this.actionScroll.toBottom();
    }

    public void setToTop() {
        this.actionScroll.toTop();
    }

    public WebElement perform() {
        while (getTheElement(byElement) == null) {
            actionScroll.release().perform();
        }
        return getTheElement(byElement);
    }
}
