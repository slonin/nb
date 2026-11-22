package principles.srp;

public class Order {
    public void processOrder() {
        System.out.println("Обрабатываем заказ...");
    }

    public void sendEmailConfirmation() {
        System.out.println("Отправляем письмо клиенту...");
    }

    public void generateInvoice() {
        System.out.println("Генерируем счет...");
    }
}