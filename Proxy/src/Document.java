import java.time.LocalDateTime;

public interface Document {
    String getId();
    String getContent(User user) throws AccessDeniedException;
    LocalDateTime getCreationDate();
}
