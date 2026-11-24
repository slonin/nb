package principles.ocp;

public class CardPayment implements Payable {
    private final String payMessage = "Оплата кредитной картой на сумму ";

    @Override
    public void pay(double amount) {
        System.out.println(payMessage + amount);
    }
}
