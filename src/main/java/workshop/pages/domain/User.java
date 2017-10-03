package workshop.pages.domain;

import lombok.Data;

/**
 * Created by yuriyborzak on 15.08.17.
 */

@Data
public class User {
    String name;
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
