# 📄 Document Export System

A Java application that demonstrates the **Interface Segregation Principle (ISP)** and **Dependency Inversion Principle (DIP)** through a flexible document export architecture. The system supports multiple document formats while providing optional capabilities such as previewing and encryption.

---

## 🚀 Features

- ✅ Export documents as PDF, CSV, and JSON
- ✅ Preview document content
- ✅ Encrypt PDF documents
- ✅ Input validation for documents and passwords
- ✅ Constructor-based Dependency Injection
- ✅ Extensible architecture for adding new exporters
- ✅ Demonstrates key SOLID principles

---

## 📂 Project Structure

```text
.
├── Codechef.java
└── README.md
```

### Codechef.java Contains

- `DocumentExporter`
- `DocumentPreviewer`
- `DocumentEncryptor`
- `PdfExporter`
- `CsvExporter`
- `JsonExporter`
- `ReportService`
- `Codechef` (Main Class)

> All interfaces and classes are implemented in a single file for simplicity and demonstration purposes.

---

## 🏗️ Design Overview

### Core Interfaces

```java
DocumentExporter
DocumentPreviewer
DocumentEncryptor
```

### Exporter Capabilities

| Exporter | Export | Preview | Encrypt |
|----------|---------|---------|----------|
| PdfExporter | ✅ | ✅ | ✅ |
| CsvExporter | ✅ | ✅ | ❌ |
| JsonExporter | ✅ | ❌ | ❌ |

---

## 📖 SOLID Principles Demonstrated

### Interface Segregation Principle (ISP)

Instead of creating one large interface containing export, preview, and encryption operations, responsibilities are divided into smaller interfaces.

This ensures that each exporter implements only the functionality it actually needs.

### Dependency Inversion Principle (DIP)

`ReportService` depends on the abstraction:

```java
DocumentExporter
```

rather than concrete implementations such as:

```java
PdfExporter
CsvExporter
JsonExporter
```

This makes the system flexible, maintainable, and easy to extend.

---

## 🔒 Validation Rules

### Document Name Validation

```java
documentName == null || documentName.isBlank()
```

### Document Content Validation

```java
content == null || content.isBlank()
```

### Password Validation

```java
password == null || password.isBlank()
```

Invalid inputs result in an `IllegalArgumentException`.

---

## 💡 Example Output

```text
PDF export completed: StudentReport
CSV export completed: StudentReport
JSON export completed: StudentReport
PDF Preview: Student: Alice, Score: 95
PDF document encrypted successfully
```

---

## ⚙️ Usage Example

### Export a Report

```java
ReportService pdfService =
    new ReportService(new PdfExporter());

System.out.println(
    pdfService.exportReport(
        "StudentReport",
        content
    )
);
```

### Preview a Document

```java
DocumentPreviewer previewer =
    new PdfExporter();

System.out.println(
    previewer.preview(content)
);
```

### Encrypt a Document

```java
DocumentEncryptor encryptor =
    new PdfExporter();

System.out.println(
    encryptor.encrypt(
        content,
        "secure123"
    )
);
```

---

## ➕ Extending the System

Adding a new exporter requires implementing the `DocumentExporter` interface.

Example:

```java
class XmlExporter implements DocumentExporter {

    @Override
    public String export(
        String documentName,
        String content
    ) {
        return "XML export completed: "
                + documentName;
    }
}
```

Usage:

```java
ReportService xmlService =
    new ReportService(
        new XmlExporter()
    );
```

No changes are required in `ReportService`.

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
- Java Interfaces
- Runtime Polymorphism
- Dependency Injection
- Input Validation
- Exception Handling
- Interface Segregation Principle (ISP)
- Dependency Inversion Principle (DIP)
- SOLID Principles
- Clean Code Practices

---

## 👨‍💻 Author

**Saurabh Kumar**

- B.Tech Student
- Competitive Programmer
- Java & OOP Learner

**GitHub:**  
🔗 https://github.com/saurabh2413001

This project demonstrates how SOLID principles can be used to build a flexible, maintainable, and extensible document export system in Java.