public class Main {
    public static void main(String[]args) {
        ComputerBuilder builder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        director.constructComputer();
        Computer computer = builder.getComputer();
        System.out.println(computer);

        builder = new OfficeComputerBuilder();
        director = new ComputerDirector(builder);
        director.constructComputer();
        computer = builder.getComputer();
        System.out.println(computer);

    }
}
