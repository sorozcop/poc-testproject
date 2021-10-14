package actions.tap;

import org.openqa.selenium.By;

public class Tap {
    private TapElement tapElement = new TapElement();

    private Tap(By byTheElement) {
        this.tapElement.setByElement(byTheElement);
    }

    public static Tap theElement(By byTheElement) {
        return new Tap(byTheElement);
    }

    public TapElement release() {
        return this.tapElement;
    }
}
