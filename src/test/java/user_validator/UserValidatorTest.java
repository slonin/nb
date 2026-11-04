package user_validator;

import complex_tasks.validator.InvalidUserException;
import complex_tasks.validator.User;
import complex_tasks.validator.UserValidator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    @Test
    void userValidator_validationDisabled() {
        User user = new User("nick", 17, "nickgmail.com");
        UserValidator uv = new UserValidator();
        uv.validationEnabled = false;

        assertDoesNotThrow(() -> uv.validateUser(user));
    }

    @Test
    void userValidator_validUser() {
        User user = new User("Nick", 18, "nick@gmail.com");
        UserValidator uv = new UserValidator();

        assertDoesNotThrow(() -> uv.validateUser(user));
    }

    @Test
    void userValidator_invalidUserNameEmpty() {
        User user = new User("", 18, "nick@gmail.com");
        UserValidator uv = new UserValidator();

        assertThrows(InvalidUserException.class, () -> uv.validateUser(user));
    }

    @Test
    void userValidator_invalidUserNameLowercase() {
        User user = new User("nick", 18, "nick@gmail.com");
        UserValidator uv = new UserValidator();

        assertThrows(InvalidUserException.class, () -> uv.validateUser(user));
    }

    @Test
    void userValidator_invalidUserAgeYoung() {
        User user = new User("nick", 17, "nick@gmail.com");
        UserValidator uv = new UserValidator();

        assertThrows(InvalidUserException.class, () -> uv.validateUser(user));
    }

    @Test
    void userValidator_invalidUserAgeOld() {
        User user = new User("nick", 101, "nick@gmail.com");
        UserValidator uv = new UserValidator();

        assertThrows(InvalidUserException.class, () -> uv.validateUser(user));
    }

    @Test
    void userValidator_invalidUserEmail() {
        User user = new User("nick", 17, "nickgmail.com");
        UserValidator uv = new UserValidator();

        assertThrows(InvalidUserException.class, () -> uv.validateUser(user));
    }
}
