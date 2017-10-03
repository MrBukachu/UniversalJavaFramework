package workshop.pages.component;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LeftPanel {
    private SelenideElement element;

    //parent locator
    public LeftPanel(String selector) {
        this.element = $(selector);
    }

    //indeed elements in main locator
    public SelenideElement feed() {
        return element.find("");
    }
    public SelenideElement dasboards() {
        return element.find("");
    }
    public SelenideElement accounts() {
        return element.find("#sidebar-item-text-3");
    }

    public void goToDashboardsSection() {
        dasboards().click();
    }
}
