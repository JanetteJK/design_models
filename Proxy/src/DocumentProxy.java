import java.time.LocalDateTime;

public class DocumentProxy implements Document {
    private RealDocument realDocument;
    private AccessControlService accessControlService;

    public DocumentProxy(RealDocument realDocument) {
        this.realDocument = realDocument;
        this.accessControlService = AccessControlService.getInstance();
    }
    @Override
    public String getId() {
        return realDocument.getId();
    }
    @Override
    public LocalDateTime getCreationDate() {
        return realDocument.getCreationDate();
    }
    @Override
    public String getContent(User user) throws AccessDeniedException{
        if (accessControlService.isUserAllowed(realDocument.getId(), user.getUsername())) {
            return realDocument.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied on document " + realDocument.getId() + ", for user " + user.getUsername());
        }
    }


}
