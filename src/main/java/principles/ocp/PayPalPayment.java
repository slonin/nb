package principles.ocp;

public class PayPalPayment implements Payable {
    private final String payMessage = "Оплата через PayPal на сумму ";

    @Override
    public void pay(double amount) {
        System.out.println(payMessage + amount);
    }
}
