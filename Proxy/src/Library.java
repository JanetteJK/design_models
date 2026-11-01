import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Document> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(Document document) {
        documents.put(document.getId(), document);
    }

    public Document getDocument(String id) {
        return documents.get(id);
    }

    public void createProtectedDocument(String id, String content, LocalDateTime creationDate) {
        RealDocument realDocument = new RealDocument(id, content, creationDate);
        DocumentProxy documentProxy = new DocumentProxy(realDocument);
        addDocument(documentProxy);
    }
}
