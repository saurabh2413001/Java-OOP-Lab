Payment Processing System

The Payment Processing System is a Java-based Object-Oriented Programming (OOP) project that demonstrates the concept of Abstraction using an abstract class and multiple concrete implementations.

The project defines a common abstract class Payment and implements different payment methods through:

Credit Card Payment
UPI Payment
This design ensures that different payment methods follow a common structure while providing their own implementation for processing payments.

Features
Abstract Payment class
Abstract processPayment() method
Input validation using exceptions
Credit Card payment processing
UPI payment processing
Demonstrates runtime polymorphism through parent class references
Proper encapsulation using private fields and getter methods
Project Structure
Payment Processing System/
│
├── Payment.java
├── CreditCardPayment.java
├── UpiPayment.java
└── Main.java

Class Description
Payment (Abstract Class)

The Payment class serves as the base class for all payment types.

Responsibilities:
Stores payment amount
Validates payment amount
Provides getter method for amount
Declares abstract method processPayment()
CreditCardPayment

Extends the Payment class and represents credit card transactions.

Responsibilities:
Stores cardholder name
Validates cardholder details
Processes credit card payments
UpiPayment

Extends the Payment class and represents UPI transactions.

Responsibilities:
Stores UPI ID
Validates UPI details
Processes UPI payments
Main

Demonstrates abstraction and polymorphism by creating payment objects using Payment references.

Concepts Used
Abstraction
Inheritance
Method Overriding
Runtime Polymorphism
Encapsulation
Exception Handling
Sample Output
Plain Text
Credit card payment of 2500.0 processed for Aman
UPI payment of 1500.0 processed for aman@upi
Validation Rules
Payment Amount
Must be greater than 0
Cannot be NaN
Cannot be infinite
Cardholder Name
Cannot be null
Cannot be blank
UPI ID
Cannot be null
Cannot be blank
Learning Outcomes

Through this project, you will learn:

How to create abstract classes in Java
How to declare and implement abstract methods
How inheritance works
How method overriding enables runtime polymorphism
How to validate user input using exceptions
How to design extensible payment systems using OOP principles


Author

Saurabh Kumar