import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

// Represents an item in a food order.
class OrderItem {
    private final String name;
    private final int quantity;
    private final double unitPrice;

    public OrderItem(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}

// Stores the customer's order information.
class FoodOrder {
    private final String orderId;
    private final String customerName;
    private final List<OrderItem> items;

    public FoodOrder(
            String orderId,
            String customerName,
            List<OrderItem> items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items == null
                ? null
                : Collections.unmodifiableList(new ArrayList<>(items));
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}

// Stores the calculated bill details.
class Bill {
    private final double subtotal;
    private final double discount;
    private final double deliveryFee;
    private final double total;

    public Bill(double subtotal, double discount, double deliveryFee, double total) {
        this.subtotal = subtotal;
        this.discount = discount;
        this.deliveryFee = deliveryFee;
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getDiscount() {
        return discount;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public double getTotal() {
        return total;
    }
}

// Implement order validation.
class OrderValidator {

    public void validate(FoodOrder order) {
        // Reject a null order.
        // Validate the order ID and customer name.
        // Ensure the order contains at least one item.
        // Reject null items, blank item names,
        // non-positive quantities, and invalid prices.
        if(order == null){
            throw new IllegalArgumentException("Order cannot be null");
        }
        if(order.getOrderId() == null || order.getOrderId().trim().isEmpty()){
            throw new IllegalArgumentException("Order ID is required");
        }
        if(order.getCustomerName() == null || order.getCustomerName().trim().isEmpty()){
            throw new IllegalArgumentException("Customer name is required");
        }

        List<OrderItem>a = order.getItems();
        if(a == null || a.isEmpty()){
    throw new IllegalArgumentException(
        "Order must contain at least one item"
    );
}
        for(int i=0;i<a.size();i++){
            if(a.get(i)==null){
                throw new IllegalArgumentException("Order item cannot be null");
            }
            if(a.get(i).getName().trim().isEmpty()){
                throw new IllegalArgumentException("Item name is required");
            }
            if(a.get(i).getQuantity()<=0){
                throw new IllegalArgumentException("Quantity must be greater than zero");
            }
            if(a.get(i).getUnitPrice()<0 || Double.isNaN(a.get(i).getUnitPrice()) || !Double.isFinite(a.get(i).getUnitPrice())){
                throw new IllegalArgumentException("Unit price must be finite and non-negative");
            }
        }
    }
}

// Implement billing calculations.
class BillCalculator {
    private static final double DISCOUNT_THRESHOLD = 1000.0;
    private static final double DISCOUNT_RATE = 0.10;
    private static final double FREE_DELIVERY_THRESHOLD = 500.0;
    private static final double DELIVERY_FEE = 40.0;

    public Bill calculate(FoodOrder order) {
        // Calculate the subtotal from all order items.
        // Apply a 10% discount when the subtotal
        // is at least DISCOUNT_THRESHOLD.
        // Apply free delivery when the subtotal
        // is at least FREE_DELIVERY_THRESHOLD.
        // Calculate and return the final bill.
        // Round monetary values to two decimal places.
        double subtotal = 0;

    List<OrderItem> a = order.getItems();

    for(int i = 0; i < a.size(); i++){
        subtotal += a.get(i).getUnitPrice() * a.get(i).getQuantity();
    }

    double discount = 0.0;
    double deliveryFee = DELIVERY_FEE;

    if(subtotal >= DISCOUNT_THRESHOLD){
        discount = subtotal * 0.10;
    }

    if(subtotal >= FREE_DELIVERY_THRESHOLD){
        deliveryFee = 0.0;
    }

    double total = subtotal - discount + deliveryFee;

    subtotal = Math.round(subtotal * 100.0) / 100.0;
    discount = Math.round(discount * 100.0) / 100.0;
    deliveryFee = Math.round(deliveryFee * 100.0) / 100.0;
    total = Math.round(total * 100.0) / 100.0;

    return new Bill(subtotal, discount, deliveryFee, total);
        }
    }

// Implement receipt generation.
class ReceiptGenerator {

    public String generate(FoodOrder order, Bill bill) {
        // Generate a receipt containing:
        // Order ID, customer name, item details,
        // subtotal, discount, delivery fee, and total.
        // Format monetary values to two decimal places.
        StringBuilder sb = new StringBuilder();

    sb.append("===== FOOD ORDER RECEIPT =====\n");
    sb.append("Order ID: ").append(order.getOrderId()).append("\n");
    sb.append("Customer: ").append(order.getCustomerName()).append("\n");

    sb.append("Items:\n");

    List<OrderItem> a = order.getItems();

    for(int i = 0; i < a.size(); i++) {

        double cost =
                a.get(i).getQuantity() *
                a.get(i).getUnitPrice();

        sb.append("- ")
          .append(a.get(i).getName())
          .append(" x ")
          .append(a.get(i).getQuantity())
          .append(" = ")
          .append(String.format(Locale.US,"%.2f", cost))
          .append("\n");
    }

    sb.append("Subtotal: ")
      .append(String.format(Locale.US,"%.2f", bill.getSubtotal()))
      .append("\n");

    sb.append("Discount: ")
      .append(String.format(Locale.US,"%.2f", bill.getDiscount()))
      .append("\n");

    sb.append("Delivery Fee: ")
      .append(String.format(Locale.US,"%.2f", bill.getDeliveryFee()))
      .append("\n");

    sb.append("Total: ")
      .append(String.format(Locale.US,"%.2f", bill.getTotal()))
      .append("\n");

    return sb.toString();
    }
}

// Coordinate the order-processing workflow.
class OrderProcessor {
    private final OrderValidator validator;
    private final BillCalculator calculator;
    private final ReceiptGenerator receiptGenerator;

    public OrderProcessor(OrderValidator validator, BillCalculator calculator, ReceiptGenerator receiptGenerator) {
        this.validator = validator;
        this.calculator = calculator;
        this.receiptGenerator = receiptGenerator;
    }

    public String processOrder(FoodOrder order) {
        // Validate the order.
        // Calculate the bill.
        // Generate and return the receipt.
        validator.validate(order);

        Bill bill = calculator.calculate(order);

        return receiptGenerator.generate(order, bill);
    }
}

public class Codechef {
    public static void main(String[] args) {
        List<OrderItem> items = new ArrayList<>();
        items.add(new OrderItem("Burger", 2, 150.0));
        items.add(new OrderItem("Pizza", 1, 800.0));

        FoodOrder order = new FoodOrder("ORD101", "Alice", items);

        OrderProcessor processor = new OrderProcessor(
                new OrderValidator(),
                new BillCalculator(),
                new ReceiptGenerator());

        System.out.println(processor.processOrder(order));
    }
}


