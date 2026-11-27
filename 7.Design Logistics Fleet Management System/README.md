# 🚚 Logistics Fleet Management System

A Java application that demonstrates the principles of **Abstraction**, **Runtime Polymorphism**, and **Interface-Based Design** through a logistics fleet management system. The application manages multiple delivery partners such as bikes, trucks, and drones while maintaining a flexible, scalable, and loosely coupled architecture.

---

## 🚀 Features

- ✅ Interface-based fleet management
- ✅ Support for multiple delivery vehicles
- ✅ Runtime polymorphism
- ✅ Centralized delivery coordination
- ✅ Extensible architecture for new vehicle types
- ✅ Loose coupling through abstraction
- ✅ Demonstrates core OOP and SOLID concepts

---

## 📂 Project Structure

```text
.
├── Codechef.java
└── README.md
```

### Codechef.java Contains

- `DeliveryPartner` (Interface)
- `BikePartner`
- `TruckPartner`
- `DronePartner`
- `DeliveryService`
- `Codechef` (Main Class)

> All interfaces and classes are implemented in a single file for simplicity and demonstration purposes.

---

## 🏗️ System Architecture

### Core Interface

```java
DeliveryPartner
```

The interface defines a common contract that every delivery vehicle must implement.

### Fleet Components

| Vehicle Type | Purpose |
|-------------|----------|
| BikePartner | Small package delivery |
| TruckPartner | Heavy goods transportation |
| DronePartner | Fast aerial delivery |

---

## 📖 SOLID Principles Demonstrated

### Abstraction

The system interacts with a common interface rather than concrete implementations.

```java
DeliveryPartner partner;
```

This hides implementation details and exposes only the required behavior.

### Runtime Polymorphism

Different fleet units implement the same delivery operation differently.

```java
partner.deliver(packageName);
```

The method executed depends on the actual object assigned at runtime.

### Dependency Inversion Principle (DIP)

`DeliveryService` depends on the abstraction:

```java
DeliveryPartner
```

instead of concrete implementations such as:

```java
BikePartner
TruckPartner
DronePartner
```

This improves maintainability and scalability.

---

## ⚙️ Delivery Workflow

### Step 1: Create a Fleet Unit

```java
DeliveryPartner bike =
    new BikePartner();
```

### Step 2: Assign Delivery

```java
service.processDelivery(
    bike,
    "Mobile Phone"
);
```

### Step 3: Execute Delivery

```java
partner.deliver(packageName);
```

The service delegates the task to the appropriate fleet unit.

---

## 💡 Sample Output

```text
Bike Partner delivered package: Mobile Phone
Truck Partner delivered package: Washing Machine
Drone Partner delivered package: Medicine Box
```

---

## 🔄 System Flow

```text
Customer Request
       │
       ▼
 DeliveryService
       │
       ▼
 DeliveryPartner
       │
 ┌─────┼─────────────┐
 ▼     ▼             ▼
Bike  Truck       Drone
```

---

## ➕ Extending the Fleet

Adding a new vehicle requires implementing the `DeliveryPartner` interface.

Example:

```java
class VanPartner implements DeliveryPartner {

    @Override
    public void deliver(String packageName) {
        System.out.println(
            "Van Partner delivered package: "
            + packageName
        );
    }
}
```

No modifications are required in `DeliveryService`.

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

- Object-Oriented Programming (OOP)
- Interfaces
- Abstraction
- Runtime Polymorphism
- Method Overriding
- Dependency Inversion Principle (DIP)
- Loose Coupling
- Interface-Based Design
- SOLID Principles

---

## 👨‍💻 Author

**Saurabh Kumar**

- B.Tech Information Technology Student
- Competitive Programmer
- Java & Backend Development Enthusiast

**GitHub:**  
🔗 https://github.com/saurabh2413001

---

This project demonstrates how object-oriented design principles can be applied to build a flexible and scalable logistics fleet management system capable of supporting multiple delivery channels with minimal code changes.