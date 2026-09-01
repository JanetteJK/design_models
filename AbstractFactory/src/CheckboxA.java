public class CheckboxA extends Checkbox {
    public CheckboxA(String text) {
        super(text);
    }

    @Override
    void display() {
        System.out.println("* Checkbox A " + text + " *");
    }
}
