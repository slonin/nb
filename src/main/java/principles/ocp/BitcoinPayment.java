package principles.ocp;

public class BitcoinPayment implements Payable {
    private final String payMessage = "Оплата Bitcoin на сумму ";

    @Override
    public void pay(double amount) {
        System.out.println(payMessage + amount);
    }
}

