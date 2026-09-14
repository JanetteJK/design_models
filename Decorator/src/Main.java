public class Main {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print("Hello world!");

        Printer printer2 = new EncryptedPrinter(new XMLPrinter((new BasicPrinter())));
        printer2.print("Hello world!");

        Printer printer3 = new EncryptedPrinter(new DecryptedPrinter(new XMLPrinter(new BasicPrinter())));
        printer3.print("Hello world!");
    }
}
