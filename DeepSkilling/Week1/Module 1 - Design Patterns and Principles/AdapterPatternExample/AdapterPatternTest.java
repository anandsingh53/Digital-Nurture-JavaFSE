public class AdapterPatternTest {

    public static void main(String[] args) {

        // Using PayPal
        PaymentProcessor paypal =
                new PayPalAdapter(new PayPalGateway());

        paypal.processPayment(2500);

        // Using Stripe
        PaymentProcessor stripe =
                new StripeAdapter(new StripeGateway());

        stripe.processPayment(5000);
    }
}