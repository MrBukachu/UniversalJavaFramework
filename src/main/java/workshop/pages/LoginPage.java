package workshop.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import workshop.pages.domain.User;

import static com.codeborne.selenide.Selenide.$;




/**
 * Created by yuriyborzak on 15.08.17.
 */
public class LoginPage {

    public LoginPage open() {
        Selenide.open("/");
        return this;
    }

    public MainPage loginAs(User user) throws InterruptedException {
        $(By.id("loginEdit-el")).val(user.getName());
        $(By.id("passwordEdit-el")).val(user.getPassword());
        $(By.xpath(".//*[@data-item-marker='btnLogin']")).click();
        Thread.sleep(200000);
        return new MainPage();
    }
}
