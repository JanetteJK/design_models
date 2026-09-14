import java.util.Base64;

public class EncryptedPrinter extends PrinterDecorator{
    public EncryptedPrinter (Printer decoratedPrinter) {
        super(decoratedPrinter);
    }

    @Override
    public void print(String text) {
        String encryptedMessage = Base64.getEncoder().encodeToString(text.getBytes());
        super.print(encryptedMessage);
    }
}
