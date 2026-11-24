package principles.srp;

public class OrderGeneratorInvoice {
    private final String generatingMessage = "Генерируем счет...";

    public void generateInvoice() {
        System.out.println(generatingMessage);
    }
}
