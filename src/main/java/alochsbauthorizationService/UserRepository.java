package alochsbauthorizationService;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    List<Authorities> getUserAuthorities(String user, String password) {

        List<Authorities> userAuthorities = new ArrayList<>();

        if (user.equals("alena") && password.equals("och")) {
            userAuthorities.add(Authorities.READ);
            userAuthorities.add(Authorities.WRITE);
            userAuthorities.add(Authorities.DELETE);
        }

        return userAuthorities;
    }
}