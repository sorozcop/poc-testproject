package actions.scroll;

import org.openqa.selenium.WebDriver;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Scroll {
    private final Scrolling scrolling = new Scrolling();

    public Scroll(WebDriver driver) {
        this.scrolling.setDriver(driver);
    }

    public static Scroll usingDriver(WebDriver driver) {
        return new Scroll(driver);
    }

    public Scroll toBottom() {
        this.scrolling.setToBottom(TRUE);
        return this;
    }

    public Scroll toTop() {
        this.scrolling.setToBottom(FALSE);
        return this;
    }

    public Scroll untilMaxAttempts(int timeout) {
        this.scrolling.setMaxAttempts(timeout);
        return this;
    }

    public Scrolling release() {
        return this.scrolling;
    }
}
