package workshop.tests;

import com.automation.remarks.video.annotations.Video;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import workshop.pages.LoginPage;
import workshop.pages.domain.User;

/**
 * Created by yuriyborzak on 15.08.17.
 */
public class LoginTest extends Base {

    @Test
    @Video
    public void testCanLoginWithValidateUser() throws InterruptedException {
        User user = new User("Supervisor", "Supervisor");
        new LoginPage()
                .open()
                .loginAs(user);
    }
    @Test
    public void testCanLoginWithValidateUser1() throws InterruptedException {
        User user = new User("Supervisor", "Supervisor");
        new LoginPage()
                .open()
                .loginAs(user);
    }
    @Test
    public void testCanLoginWithValidateUser2() throws InterruptedException {
        User user = new User("Supervisor", "Supervisor");
        new LoginPage()
                .open()
                .loginAs(user);
    }
}
