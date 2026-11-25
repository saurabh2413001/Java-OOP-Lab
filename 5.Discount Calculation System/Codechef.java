interface DiscountPolicy {
    double calculateDiscount(double amount);
}

// Provides a 5% discount to regular customers.
class RegularDiscount implements DiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {
        // Validate the purchase amount.
        // Calculate and return a 5% discount.
        // Round the discount to two decimal places.
        if(!Double.isFinite(amount) || amount < 0){
            throw new IllegalArgumentException("Invalid purchase amount");
        }
        
        double discount = amount*0.05;
        return Math.round(discount * 100.0) / 100.0;

    }

    private void validateAmount(double amount) {
        if (!Double.isFinite(amount) || amount < 0) {
            throw new IllegalArgumentException("Invalid purchase amount");
        }
    }

    private double roundMoney(double amount) {
        return Math.round(amount * 100.0) / 100.0;
    }
}

// Provides a 10% discount to premium customers.
class PremiumDiscount implements DiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {
        // Validate the purchase amount.
        // Calculate and return a 10% discount.
        // Round the discount to two decimal places.
        if(!Double.isFinite(amount) || amount < 0){
            throw new IllegalArgumentException("Invalid purchase amount");
        }
        
        double discount = amount*0.1;
        return Math.round(discount * 100.0) / 100.0;

    }

    private void validateAmount(double amount) {
        if (!Double.isFinite(amount) || amount < 0) {
            throw new IllegalArgumentException("Invalid purchase amount");
        }
    }

    private double roundMoney(double amount) {
        return Math.round(amount * 100.0) / 100.0;
    }
}

// Provides a 15% discount during festivals.
class FestivalDiscount implements DiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {
        // Validate the purchase amount.
        // Calculate and return a 15% discount.
        // Round the discount to two decimal places.
        if(!Double.isFinite(amount) || amount < 0){
            throw new IllegalArgumentException("Invalid purchase amount");
        }
        
        double discount = amount*0.15;
        return Math.round(discount * 100.0) / 100.0;

    }

    private void validateAmount(double amount) {
        if (!Double.isFinite(amount) || amount < 0) {
            throw new IllegalArgumentException("Invalid purchase amount");
        }
    }

    private double roundMoney(double amount) {
        return Math.round(amount * 100.0) / 100.0;
    }
}

// Calculates the final amount using any discount policy.
class CheckoutService {
    private final DiscountPolicy discountPolicy;

    public CheckoutService(DiscountPolicy discountPolicy) {
        if (discountPolicy == null) {
            throw new IllegalArgumentException("Discount policy cannot be null");
        }

        this.discountPolicy = discountPolicy;
    }

    public double calculateFinalAmount(double amount) {
        // Reject negative or non-finite purchase amounts.
        // Calculate the discount using discountPolicy.
        // Reject negative, non-finite, or excessive discounts.
        // Subtract the discount from the purchase amount.
        // Return the final amount rounded to two decimal places.
        if (!Double.isFinite(amount) || amount < 0) {
            throw new IllegalArgumentException("Invalid purchase amount");
        }

        double discount = discountPolicy.calculateDiscount(amount);

        if(!Double.isFinite(discount) || discount<0 || discount>amount){
            throw new IllegalArgumentException("Invalid discount amount");
        }

        double finalAmount = amount - discount;

        return Math.round(finalAmount*100.0)/100;

    }

    private double roundMoney(double amount) {
        return Math.round(amount * 100.0) / 100.0;
    }
}

public class Codechef {
    public static void main(String[] args) {
        double amount = 2000.0;

        CheckoutService regularCheckout = new CheckoutService(new RegularDiscount());

        CheckoutService premiumCheckout = new CheckoutService(new PremiumDiscount());

        CheckoutService festivalCheckout = new CheckoutService(new FestivalDiscount());

        System.out.println("Purchase Amount: " + amount);

        System.out.println("Regular Customer Final Amount: " + regularCheckout.calculateFinalAmount(amount));

        System.out.println("Premium Customer Final Amount: " + premiumCheckout.calculateFinalAmount(amount));

        System.out.println("Festival Discount Final Amount: " + festivalCheckout.calculateFinalAmount(amount));
    }
}


