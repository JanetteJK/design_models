import java.time.LocalDateTime;

public class RealDocument implements Document {
    private String id;
    private String content;
    private LocalDateTime creationDate;

    public RealDocument(String id, String content, LocalDateTime creationDate) {
        this.id = id;
        this.content = content;
        this.creationDate = creationDate;
    }
    @Override
    public String getId() {
        return id;
    }
    @Override
    public String getContent(User user) {
        return content;
    }
    @Override
    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
