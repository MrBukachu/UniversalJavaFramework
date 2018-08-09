package workshop.tests;

import com.automation.remarks.testng.VideoListener;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners ({VideoListener.class})

public class Base {
@BeforeClass
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "workshop.pages.SelenoidWebDriverProvider"; //workshop.pages.SelenoidWebDriverProvider
        Configuration.baseUrl = "http://tscore-dev-04:8080/SalesEnterpriseENU_1555393_0924";
        Configuration.holdBrowserOpen = false;
        Configuration.collectionsTimeout = 10000; //explicite
        Configuration.timeout = 4000; //implicite
        Configuration.fastSetValue = true;
    }
}
