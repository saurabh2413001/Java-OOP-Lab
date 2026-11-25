# 💳 Discount Policy System

A Java application that demonstrates the **Strategy Design Pattern** by applying different discount policies during checkout. The system allows flexible discount calculation for various customer types while ensuring proper validation and monetary rounding.

---

## 🚀 Features

- ✅ Strategy Design Pattern implementation
- ✅ Multiple discount policies:
  - Regular Customer Discount (5%)
  - Premium Customer Discount (10%)
  - Festival Discount (15%)
- ✅ Input validation for purchase amounts
- ✅ Validation of calculated discounts
- ✅ Monetary values rounded to two decimal places
- ✅ Extensible architecture for adding new discount strategies

---

## 📂 Project Structure

```text
.
├── DiscountPolicy.java
├── RegularDiscount.java
├── PremiumDiscount.java
├── FestivalDiscount.java
├── CheckoutService.java
└── Codechef.java
```

---

## 🏗️ Design Pattern Used

### Strategy Pattern

The `DiscountPolicy` interface defines a common contract for all discount strategies.

```java
interface DiscountPolicy {
    double calculateDiscount(double amount);
}
```

Each discount type implements its own calculation logic independently.

```java
RegularDiscount
PremiumDiscount
FestivalDiscount
```

The `CheckoutService` uses composition to apply any discount strategy at runtime.

---

## 📖 Class Overview

### 1. DiscountPolicy

Defines the contract for discount calculation.

```java
double calculateDiscount(double amount);
```

### 2. RegularDiscount

Applies a **5% discount** to regular customers.

### 3. PremiumDiscount

Applies a **10% discount** to premium customers.

### 4. FestivalDiscount

Applies a **15% discount** during festival sales.

### 5. CheckoutService

Responsible for:

- Validating purchase amounts
- Applying discount strategies
- Verifying discount correctness
- Calculating final payable amount
- Returning rounded monetary values

---

## 🔒 Validation Rules

### Purchase Amount Validation

The application throws an exception when:

```java
amount < 0
```

or

```java
amount is NaN or Infinite
```

### Discount Validation

The application rejects discounts when:

```java
discount < 0
discount > amount
discount is NaN
discount is Infinite
```

---

## 💡 Example Output

**Input**

```java
double amount = 2000.0;
```

**Output**

```text
Purchase Amount: 2000.0
Regular Customer Final Amount: 1900.0
Premium Customer Final Amount: 1800.0
Festival Discount Final Amount: 1700.0
```

---

## ⚙️ How It Works

### Regular Customer Checkout

```java
CheckoutService regularCheckout =
    new CheckoutService(new RegularDiscount());
```

### Premium Customer Checkout

```java
CheckoutService premiumCheckout =
    new CheckoutService(new PremiumDiscount());
```

### Festival Offer Checkout

```java
CheckoutService festivalCheckout =
    new CheckoutService(new FestivalDiscount());
```

The checkout logic remains unchanged while the discount strategy can be switched dynamically.

---

## ✅ Benefits of This Design

- Open for extension, closed for modification
- Easy to add new discount types
- Loose coupling between checkout and discount logic
- Better maintainability and scalability
- Follows SOLID principles:
  - Single Responsibility Principle (SRP)
  - Open/Closed Principle (OCP)
  - Dependency Inversion Principle (DIP)

---

## ➕ Adding a New Discount Policy

Example: Student Discount (20%)

```java
class StudentDiscount implements DiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {

        if (!Double.isFinite(amount) || amount < 0) {
            throw new IllegalArgumentException(
                "Invalid purchase amount"
            );
        }

        double discount = amount * 0.20;

        return Math.round(discount * 100.0) / 100.0;
    }
}
```

Usage:

```java
CheckoutService studentCheckout =
    new CheckoutService(new StudentDiscount());
```

No changes are required in `CheckoutService`.

---

## 🛠️ Compilation & Execution

### Compile

```bash
javac Codechef.java
```

### Run

```bash
java Codechef
```

---

## 📚 Concepts Demonstrated

- Java Interfaces
- Strategy Design Pattern
- Runtime Polymorphism
- Dependency Injection
- Exception Handling
- Input Validation
- Monetary Calculations
- Clean Code Practices

---

## Author

**Saurabh Kumar**

- B.Tech Student
- Competitive Programmer
- Java & OOP Learner

**GitHub:**  
https://github.com/saurabh2413001

This project demonstrates how the **Strategy Pattern** can be used to build a flexible, scalable, and maintainable discount management system in Java.