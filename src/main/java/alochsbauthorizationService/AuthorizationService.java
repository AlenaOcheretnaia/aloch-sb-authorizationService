package alochsbauthorizationService;

import java.util.List;

public class AuthorizationService {
    UserRepository userRepository = new UserRepository();

    List<Authorities> getAuthorities(String user, String password) {

        if (isEmptyStr(user) || isEmptyStr(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }

        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmptyList(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }

        return userAuthorities;

    }

    private boolean isEmptyStr(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmptyList(List<?> list) {
        return list == null || list.isEmpty();
    }
}