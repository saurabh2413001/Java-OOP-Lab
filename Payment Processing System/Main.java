public class Main {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment(2500.0, "Aman");

        Payment payment2 = new UpiPayment(1500.0, "aman@upi");

        payment1.processPayment();
        payment2.processPayment();
    }
}