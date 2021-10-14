package actions.drag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Drag {
    private DragElemet dragElemet = new DragElemet();

    private Drag(By byElement) {
        this.dragElemet.setByElement(byElement);
    }

    public static Drag theElement(By target) {
        return new Drag(target);
    }

    public Drag to(DragDirection direction) {
        this.dragElemet.setDirection(direction);
        return this;
    }

    public Drag withTheDriver(WebDriver driver) {
        this.dragElemet.setDriver(driver);
        return this;
    }

    public DragElemet release() {
        return this.dragElemet;
    }
}