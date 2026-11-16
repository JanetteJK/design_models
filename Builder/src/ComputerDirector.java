public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void constructComputer() {
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildHardDrive();
        computerBuilder.buildProcessor();
        computerBuilder.buildOS();
        computerBuilder.buildRAM();
    }

}
