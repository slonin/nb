package principles.srp;

public class OrderProcessor {
    private final String processingMessage = "Обрабатываем заказ...";

    public void processOrder() {
        System.out.println(processingMessage);
    }
}
