public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    // Set Strategy
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Execute Strategy
    public void makePayment(double amount) {

        if (paymentStrategy == null) {
            System.out.println("No payment method selected.");
            return;
        }

        paymentStrategy.pay(amount);
    }
}