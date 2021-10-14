package actions.find;

import org.openqa.selenium.By;

public class Find {
    private final Finder finder = new Finder();

    private Find(By byElement) {
        this.finder.setByElement(byElement);
    }

    public static Find theElement(By byElement) {
        return new Find(byElement);
    }

    public Find toBottom() {
        this.finder.setToBottom();
        return this;
    }

    public Find toTop() {
        this.finder.setToTop();
        return this;
    }

    public Find untilMaxAttepmts(int maxAttempts) {
        this.finder.setMaxAttepmts(maxAttempts);
        return this;
    }

    public Finder release() {
        return this.finder;
    }
}
