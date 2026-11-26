# 📄 Document Export System

A Java application demonstrating the **Interface Segregation Principle (ISP)** and **Dependency Inversion Principle (DIP)** using a flexible document export system.

## 🚀 Features

- Export documents as PDF, CSV, and JSON
- Preview document content
- Encrypt PDF documents
- Input validation for documents and passwords
- Dependency Injection using abstractions
- Easily extensible architecture

## 📂 Project Structure

```text
.
├── Codechef.java
└── README.md
```

> All interfaces and classes are implemented in a single file (`Codechef.java`) for demonstration purposes.

## 🏗️ Design Overview

### Interfaces

```java
DocumentExporter
DocumentPreviewer
DocumentEncryptor
```

### Implementations

| Class | Export | Preview | Encrypt |
|---------|---------|---------|---------|
| PdfExporter | ✅ | ✅ | ✅ |
| CsvExporter | ✅ | ✅ | ❌ |
| JsonExporter | ✅ | ❌ | ❌ |

## 📖 SOLID Principles

### Interface Segregation Principle (ISP)

Each class implements only the interfaces it needs.

### Dependency Inversion Principle (DIP)

`ReportService` depends on the abstraction:

```java
DocumentExporter
```

rather than concrete exporter implementations.

## 💡 Example Output

```text
PDF export completed: StudentReport
CSV export completed: StudentReport
JSON export completed: StudentReport
PDF Preview: Student: Alice, Score: 95
PDF document encrypted successfully
```

## ➕ Extending the System

Adding a new exporter only requires implementing:

```java
DocumentExporter
```

Example:

```java
class XmlExporter implements DocumentExporter
```

No changes are needed in `ReportService`.

## 🛠️ Run

```bash
javac Codechef.java
java Codechef
```

## 📚 Concepts Demonstrated

- Java Interfaces
- OOP
- Interface Segregation Principle (ISP)
- Dependency Inversion Principle (DIP)
- Dependency Injection
- Runtime Polymorphism
- Exception Handling
- Input Validation

## 👨‍💻 Author

**Saurabh Kumar**

GitHub: https://github.com/saurabh2413001# 📄 Document Export System
 
A Java application demonstrating the **Interface Segregation Principle (ISP)** and **Dependency Inversion Principle (DIP)** using a flexible document export system.
 
## 🚀 Features
 
- Export documents as PDF, CSV, and JSON
- Preview document content
- Encrypt PDF documents
- Input validation for documents and passwords
- Dependency Injection using abstractions
- Easily extensible architecture
 
## 📂 Project Structure
 
```text
.
├── Codechef.java
└── README.md
```
 
> All interfaces and classes are implemented in a single file (`Codechef.java`) for demonstration purposes.
 
## 🏗️ Design Overview
 
### Interfaces
 
```java
DocumentExporter
DocumentPreviewer
DocumentEncryptor
```
 
### Implementations
 
| Class | Export | Preview | Encrypt |
|---------|---------|---------|---------|
| PdfExporter | ✅ | ✅ | ✅ |
| CsvExporter | ✅ | ✅ | ❌ |
| JsonExporter | ✅ | ❌ | ❌ |
 
## 📖 SOLID Principles
 
### Interface Segregation Principle (ISP)
 
Each class implements only the interfaces it needs.
 
### Dependency Inversion Principle (DIP)
 
`ReportService` depends on the abstraction:
 
```java
DocumentExporter
```
 
rather than concrete exporter implementations.
 
## 💡 Example Output
 
```text
PDF export completed: StudentReport
CSV export completed: StudentReport
JSON export completed: StudentReport
PDF Preview: Student: Alice, Score: 95
PDF document encrypted successfully
```
 
## ➕ Extending the System
 
Adding a new exporter only requires implementing:
 
```java
DocumentExporter
```
 
Example:
 
```java
class XmlExporter implements DocumentExporter
```
 
No changes are needed in `ReportService`.
 
## 🛠️ Run
 
```bash
javac Codechef.java
java Codechef
```
 
## 📚 Concepts Demonstrated
 
- Java Interfaces
- OOP
- Interface Segregation Principle (ISP)
- Dependency Inversion Principle (DIP)
- Dependency Injection
- Runtime Polymorphism
- Exception Handling
- Input Validation
 
## 👨‍💻 Author
 
**Saurabh Kumar**
 
GitHub: https://github.com/saurabh2413001

Ye GitHub projects ke liye ideal length hai. Na unnecessary long, na too short. Recruiters 30–40 sec me poora read kar sakte hain.

ye bahut consize ho gya

Bilkul bhai. Mere hisab se medium-length README best rahegi. Na itni lambi ki recruiter skip kar de, na itni chhoti ki project trivial lage.

Markdown
# 📄 Document Export System
 
A Java application that demonstrates the **Interface Segregation Principle (ISP)** and **Dependency Inversion Principle (DIP)** using a flexible document export system. The application supports exporting documents in multiple formats while providing additional capabilities such as previewing and encryption where applicable.
 
---
 
## 🚀 Features
 
- Export documents as PDF, CSV, and JSON
- Preview document content
- Encrypt PDF documents using a password
- Input validation for document names, content, and passwords
- Constructor-based Dependency Injection
- Easily extensible design for adding new exporters
- Demonstrates key SOLID principles
 
---