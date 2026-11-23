# Food Order Processing System

## Overview

The Food Order Processing System is a Java-based application that validates customer food orders, calculates billing details, generates receipts, and coordinates the complete order-processing workflow.

The project demonstrates object-oriented programming concepts such as:

- Encapsulation
- Composition
- Validation
- Separation of concerns
- Immutable data handling

---

## Features

### Order Validation
The system validates:

- Null orders
- Missing order IDs
- Missing customer names
- Empty item lists
- Null order items
- Blank item names
- Non-positive quantities
- Invalid prices (negative, NaN, or infinite)

---

### Bill Calculation

The billing module:

- Calculates the order subtotal
- Applies a 10% discount when the subtotal is at least ₹1000
- Applies free delivery when the subtotal is at least ₹500
- Adds a ₹40 delivery fee otherwise
- Rounds all monetary values to two decimal places

#### Billing Rules

| Rule | Value |
|--------|--------|
| Discount Threshold | ₹1000 |
| Discount Rate | 10% |
| Free Delivery Threshold | ₹500 |
| Delivery Fee | ₹40 |

---

### Receipt Generation

The receipt contains:

- Order ID
- Customer Name
- Ordered Items
- Item Quantities
- Item Costs
- Subtotal
- Discount
- Delivery Fee
- Final Total

---

## Project Structure

### OrderItem

Represents a single food item.

#### Attributes

- `name`
- `quantity`
- `unitPrice`

---

### FoodOrder

Stores customer order information.

#### Attributes

- `orderId`
- `customerName`
- `items`

---

### Bill

Stores billing details.

#### Attributes

- `subtotal`
- `discount`
- `deliveryFee`
- `total`

---

### OrderValidator

Responsible for validating incoming orders before processing.

#### Main Method

```java
validate(FoodOrder order)
```

---

### BillCalculator

Calculates billing information for a valid order.

#### Main Method

```java
calculate(FoodOrder order)
```

---

### ReceiptGenerator

Creates a formatted receipt string.

#### Main Method

```java
generate(FoodOrder order, Bill bill)
```

---

### OrderProcessor

Coordinates the complete workflow.

#### Processing Steps

1. Validate Order
2. Calculate Bill
3. Generate Receipt

#### Main Method

```java
processOrder(FoodOrder order)
```

---

## Example Input

```java
List<OrderItem> items = new ArrayList<>();

items.add(new OrderItem("Burger", 2, 150.0));
items.add(new OrderItem("Pizza", 1, 800.0));

FoodOrder order =
    new FoodOrder("ORD101", "Alice", items);
```

---

## Example Output

```text
===== FOOD ORDER RECEIPT =====
Order ID: ORD101
Customer: Alice

Items:
- Burger x 2 = 300.00
- Pizza x 1 = 800.00

Subtotal: 1100.00
Discount: 110.00
Delivery Fee: 0.00
Total: 990.00
```

---

## How to Compile

```bash
javac Codechef.java
```

## How to Run

```bash
java Codechef
```

---

## Design Principles Used

- Single Responsibility Principle
- Data Encapsulation
- Immutable Order Storage
- Modular Architecture
- Reusable Components

---

## Future Enhancements

- Multiple discount strategies
- GST calculation
- Coupon support
- Order persistence using files or databases
- User interface (CLI/GUI/Web)
- Payment integration
- Inventory management

---


Food Order Processing System implemented in Java using object-oriented design principles.

## Author

**Saurabh Kumar**

- B.Tech Student
- Competitive Programmer
- Java & OOP Learner

**GitHub:**  
https://github.com/saurabh2413001


