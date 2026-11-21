// Declare this class as abstract.
public abstract class Payment {
    private final double amount;

    public Payment(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Invalid payment amount");
        }

        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    // Declare an abstract method named processPayment()
    // that takes no arguments and returns void.
    public abstract void processPayment();
    
}