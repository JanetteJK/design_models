public abstract class Organization {
    protected String name;

    public Organization(String name) {
        this.name = name;
    }

    public void add(Organization organization) {
        throw new UnsupportedOperationException();
    }

    public void remove(Organization organization) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public abstract double getSalary();

    public abstract void printXml(StringBuilder builder, int indent);
}
