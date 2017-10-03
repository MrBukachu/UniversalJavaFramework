package workshop.tests;

import org.testng.annotations.Test;
import workshop.pages.api.User;

import static com.jayway.restassured.RestAssured.when;


public class UserTest {
    @Test
    public void AddUser() throws Exception {
        when()
                .get("")
                .then().extract().response().body().as(User.class);
    }
}
