interface DocumentExporter {
    String export(String documentName, String content);
}

interface DocumentPreviewer {
    String preview(String content);
}

interface DocumentEncryptor {
    String encrypt(String content, String password);
}

// Exports documents as PDF and supports previewing and encryption.
// Update this class declaration so PdfExporter implements an interface
// for every capability it supports (see the comment above).
class PdfExporter implements DocumentExporter,DocumentPreviewer,DocumentEncryptor {

    @Override
    public String export(String documentName, String content) {
        // Validate the document name and content.
        // Return "PDF export completed: " followed by the document name.
    if(documentName == null || documentName.isBlank()){
        throw new IllegalArgumentException("Document name is required");
    }
    
    if(content == null || content.isBlank()){
        throw new IllegalArgumentException("Document content is required");
    }

    return "PDF export completed: " + documentName;
        
    }

    @Override
    public String preview(String content) {
        // Validate the content.
        // Return "PDF Preview: " followed by the content.
        if(content == null || content.isBlank()){
        throw new IllegalArgumentException("Document content is required");
        }

        return "PDF Preview: " + content;
        
    }

    @Override
    public String encrypt(String content, String password) {
        // Validate the content first, then the password.
        // Return "PDF document encrypted successfully".
        if(content == null || content.isBlank()){
        throw new IllegalArgumentException("Document content is required");
        }

        if(password == null || password.isBlank()){
        throw new IllegalArgumentException("Password is required");
        }

        return "PDF document encrypted successfully";
        
    }

    private void validateDocument(String documentName, String content) {
        if (documentName == null || documentName.isBlank()) {
            throw new IllegalArgumentException("Document name is required");
        }
        validateContent(content);
    }

    private void validateContent(String content) {
        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException("Document content is required");
        }
    }
}

// Exports documents as CSV and supports previewing.
// Update this class declaration so CsvExporter implements an interface
// for every capability it supports (see the comment above).
class CsvExporter implements DocumentExporter,DocumentPreviewer {

    @Override
    public String export(String documentName, String content) {
        // Validate the document name and content.
        // Return "CSV export completed: " followed by the document name.
        if(documentName == null || documentName.isBlank()){
        throw new IllegalArgumentException("Document name is required");
        }
    
        if(content == null || content.isBlank()){
        throw new IllegalArgumentException("Document content is required");
        }

        return "CSV export completed: " + documentName;
        
    }

    @Override
    public String preview(String content) {
        // Validate the content.
        // Return "CSV Preview: " followed by the content.
        if(content == null || content.isBlank()){
        throw new IllegalArgumentException("Document content is required");
        }

        return "CSV Preview: " + content;
       
    }

    private void validateDocument(String documentName, String content) {
        if (documentName == null || documentName.isBlank()) {
            throw new IllegalArgumentException("Document name is required");
        }
        validateContent(content);
    }

    private void validateContent(String content) {
        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException("Document content is required");
        }
    }
}

// Exports documents as JSON without preview or encryption capabilities.
class JsonExporter implements DocumentExporter {

    @Override
    public String export(String documentName, String content) {
        // Validate the document name, then the content.
        // Return "JSON export completed: " followed by the document name.
        if(documentName == null || documentName.isBlank()){
        throw new IllegalArgumentException("Document name is required");
        }
    
        if(content == null || content.isBlank()){
        throw new IllegalArgumentException("Document content is required");
        }

        return "JSON export completed: " + documentName;

    }
}

// Depends on the DocumentExporter abstraction, not a specific exporter.
class ReportService {
    private final DocumentExporter exporter;

    public ReportService(DocumentExporter exporter) {
        if (exporter == null) {
            throw new IllegalArgumentException("Document exporter cannot be null");
        }

        this.exporter = exporter;
    }

    public String exportReport(String documentName, String content) {
        // Reject a null or blank document name before delegating.
        // Delegate to the injected exporter and return its result.
        if(documentName == null || documentName.isBlank()){
        throw new IllegalArgumentException("Document name is required");
        }

        String result = exporter.export(documentName,content);
        return result;
        
    }
}

public class Codechef {
    public static void main(String[] args) {
        String documentName = "StudentReport";
        String content = "Student: Alice, Score: 95";

        ReportService pdfReportService = new ReportService(new PdfExporter());

        ReportService csvReportService = new ReportService(new CsvExporter());

        ReportService jsonReportService = new ReportService(new JsonExporter());

        System.out.println(pdfReportService.exportReport(documentName, content));

        System.out.println(csvReportService.exportReport(documentName, content));

        System.out.println(jsonReportService.exportReport(documentName, content));

        DocumentPreviewer previewer = new PdfExporter();
        System.out.println(previewer.preview(content));

        DocumentEncryptor encryptor = new PdfExporter();
        System.out.println(encryptor.encrypt(content, "secure123"));
    }
}


