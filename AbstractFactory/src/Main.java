public class Main {
    public static void main(String[] args) {
        UIFactory factory = new BFactory();

        Button button = factory.createButton("Wood");
        TextField textField = factory.createTextField("Factory");
        Checkbox checkbox = factory.createCheckbox("Create factory");

        button.display();
        textField.display();
        checkbox.display();

        button.setText("New button");
        textField.setText("New text");

        button.display();
        textField.display();
        checkbox.display();
    }
}
