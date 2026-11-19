Employee Management System
A Java Object-Oriented Programming (OOP) project that demonstrates inheritance, method overriding, encapsulation, and salary calculation for different types of employees.

Features
Create employee records with:
Employee ID
Employee Name
Base Salary
Validate employee details during object creation
Support Full-Time Employees with bonuses
Support Sales Employees with commission-based earnings
Calculate salaries using method overriding
Calculate sales commissions automatically
Demonstrate runtime polymorphism through inherited classes
Concepts Used
Object-Oriented Programming (OOP)
Inheritance
Encapsulation
Constructors
Method Overriding
Polymorphism
Input Validation
Exception Handling
Class Structure
Employee ├── FullTimeEmployee └── SalesEmployee

Project Structure
Employee-Management-System/ ├── Codechef.java └── README.md

Employee Types
FullTimeEmployee
Stores employee details
Maintains a bonus amount
Total Salary = Base Salary + Bonus
SalesEmployee
Stores employee details
Maintains sales amount and commission rate
Commission = Sales Amount × Commission Rate
Total Salary = Base Salary + Commission
Sample Output
Full-Time Employee: Aman Employee ID: E101 Base Salary: 40000.0 Bonus: 5000.0 Total Salary: 45000.0

Sales Employee: Sara Employee ID: E102 Base Salary: 30000.0 Sales Commission: 5000.0 Total Salary: 35000.0

How to Run
Compile the project:

javac Codechef.java
Run the program:

java Codechef
Validation Rules
Employee ID cannot be null or empty.
Employee name cannot be null or empty.
Base salary must be non-negative and finite.
Bonus must be non-negative and finite.
Sales amount must be non-negative and finite.
Commission rate must be between 0 and 1.
Learning Outcomes
Understanding inheritance in Java
Implementing method overriding
Using constructors with super()
Creating reusable class hierarchies
Applying encapsulation through private fields
Performing validation in object-oriented applications
Author
Saurabh Kumar

B.Tech Student
Competitive Programmer
Java & OOP Learner
GitHub: https://github.com/saurabh2413001