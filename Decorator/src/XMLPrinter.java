public class XMLPrinter extends PrinterDecorator{
    public XMLPrinter(Printer decoratedPrinter) {
        super(decoratedPrinter);
    }

    @Override
    public void print(String text) {
        String xmlMessage = "<message>" + text + "</message>";
        super.print(xmlMessage);
    }
}
