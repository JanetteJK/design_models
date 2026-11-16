public class GamingComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addProcessor("Tämä on peli prosessori");
    }

    @Override
    public void buildOS() {
        computer.addOS("Operating system: Windows");
    }

    @Override
    public void buildRAM() {
        computer.addRAM("200");
    }

    @Override
    public void buildGraphicsCard(){
        computer.addGraphicsCard("Tämä on pelikoneen grafiikkakortti");
    }

    @Override
    public void buildHardDrive(){
        computer.addHardDrive("Tämä on pelikoneen kovalevy");
    }

    @Override
    public Computer getComputer(){
        return computer;
    }
}
