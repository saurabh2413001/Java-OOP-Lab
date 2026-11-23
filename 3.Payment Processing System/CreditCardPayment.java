public class CreditCardPayment extends Payment {
    private final String cardHolderName;

    public CreditCardPayment(double amount, String cardHolderName) {
        super(amount);

        if (cardHolderName == null || cardHolderName.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid cardholder name");
        }

        this.cardHolderName = cardHolderName;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    // Override processPayment().
    // Print the payment amount and cardholder name.
    @Override
    public void processPayment() {
        System.out.println("Credit card payment of "+ getAmount()+ " processed for "+ getCardHolderName());
    }

}