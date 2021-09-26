package alochsbauthorizationService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> handleICE(InvalidCredentials e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("InvalidCredentials: " + e.getLocalizedMessage());
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> handleRE(UnauthorizedUser e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("UnauthorizedUser: " + e.getLocalizedMessage());
    }

}
