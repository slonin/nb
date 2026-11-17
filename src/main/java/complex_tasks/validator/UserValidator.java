package complex_tasks.validator;

public class UserValidator {
    public boolean validationEnabled = true;

    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidUserException("Имя не должно быть пустым");
        }

        if (!Character.isUpperCase(name.charAt(0))) {
            throw new InvalidUserException("Имя должно начинаться с большой буквы");
        }
    }

    private void validateAge(int age) {
        if (age < 18 || age > 100) {
            throw new InvalidUserException("Некорректный возраст");
        }
    }

    private void validateEmail(String email) {
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new InvalidUserException("Некорректный формат почты");
        }
    }

    public void validateUser(User user) {
        if (!validationEnabled) return;

        validateName(user.getName());
        validateAge(user.getAge());
        validateEmail(user.getEmail());
    }
}
