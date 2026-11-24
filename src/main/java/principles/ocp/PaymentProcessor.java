package principles.ocp;

public class PaymentProcessor {
    public void processPayment(Payable payment, double amount) {
        payment.pay(amount);
    }
}
