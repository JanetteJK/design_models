import java.util.ArrayList;
import java.util.List;

public class Department extends Organization{
    private List<Organization> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        return components.stream().mapToDouble(Organization::getSalary).sum();
    }

    @Override
    public void add(Organization organization) {
        components.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        components.remove(organization);
    }

    @Override
    public void printXml(StringBuilder builder, int indent) {
        builder.append("  ".repeat(indent)).append("<Department name=\"").append(name).append("\">\n");
        for (Organization component : components) {
            component.printXml(builder, indent + 1);
        }
        builder.append("  ".repeat(indent)).append("</Department>\n");
    }
}
