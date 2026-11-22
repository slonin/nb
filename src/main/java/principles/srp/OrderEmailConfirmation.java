package principles.srp;

public class OrderEmailConfirmation {
    private final String confirmationMessage = "Отправляем письмо клиенту...";

    public void sendEmailConfirmation() {
        System.out.println(confirmationMessage);
    }
}
