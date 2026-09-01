public class CheckboxB extends Checkbox {
    public CheckboxB(String text) {
        super(text);
    }

    @Override
    void display() {
        System.out.println("= Checkbox B " + text + " =");
    }
}
