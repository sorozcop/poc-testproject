package actions.find;

import actions.scroll.Scroll;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static stepsdefinition.Hooks.STANDARD_TIMEOUT;
import static stepsdefinition.Hooks.getDriver;
import static userinterfaces.Pages.getTheElement;

public class Finder {
    private By byElement;
    private Scroll actionScroll;
    private int maxAttempts;

    public Finder() {
        this.byElement = null;
        WebDriver driver = getDriver();
        this.actionScroll = Scroll.usingDriver(driver).untilMaxAttempts(1);
        this.maxAttempts = STANDARD_TIMEOUT;
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

    public void setMaxAttepmts(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public WebElement perform() {
        int excecutionNumber = 0;
        By var = MobileBy.xpath("//*[@content-desc='test-Descripci\u00F3n']//following::android.widget.textview[contains(@text,'Luz de bicicleta Sauce Labs')]");
        while (excecutionNumber < maxAttempts && getTheElement(byElement) == null) {
            actionScroll.release().perform();
            excecutionNumber++;
        }
        return getTheElement(byElement);
    }
}
