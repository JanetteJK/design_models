import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[]args) {
        Library library = new Library();
        AccessControlService accessControlService = AccessControlService.getInstance();

        User user = new User("User");
        User user2 = new User("User2");

        RealDocument doc = new RealDocument("doc", "Unprotected content", LocalDateTime.now());
        library.addDocument(doc);
        System.out.println("Document added: " + doc.getId());

        library.createProtectedDocument("doc2", "Protected content", LocalDateTime.now());
        accessControlService.allowUser("doc2", "user");

        try {
            System.out.println("User accessing doc2: " + library.getDocument("doc2").getContent(user));
            System.out.println("User accessing doc: " + library.getDocument("doc").getContent(user));
            System.out.println("User2 accessing doc2" + library.getDocument("doc2").getContent(user2));
            System.out.println("User2 accessing doc1" + library.getDocument("doc").getContent(user2));
        } catch (AccessDeniedException a) {
            System.out.println(a.getMessage());
        }
    }


}
