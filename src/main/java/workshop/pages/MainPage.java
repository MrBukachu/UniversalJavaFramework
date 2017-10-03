package workshop.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import workshop.pages.component.LeftPanel;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by yuriyborzak on 15.08.17.
 */
public class MainPage {
    public SelenideElement logo = $(By.id("logo"));

    LeftPanel leftPanel = new LeftPanel("leftPanel");
}
