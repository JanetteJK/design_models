public class Main {
    public static void main(String[]args) {
        Department company = new Department("The Company");

        Department cheese = new Department("Cheese tasters");
        cheese.add(new Employee("Janette", 40000));
        cheese.add(new Employee("Ada", 40000));

        Department wine = new Department("Wine tasters");
        wine.add(new Employee("Kaija", 40000));

        company.add(cheese);
        company.add(wine);

        System.out.println("The Company's total salary: " + company.getSalary());

        StringBuilder xmlBuilder = new StringBuilder();
        company.printXml(xmlBuilder, 0);
        System.out.println(xmlBuilder.toString());


    }
}
