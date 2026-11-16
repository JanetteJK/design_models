public class OfficeComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addProcessor("tämä on toimistokoneen prosessori");
    }

    @Override
    public void buildOS() {
        computer.addOS("Operating system: Linux");
    }

    @Override
    public void buildRAM() {
        computer.addRAM("150");
    }

    @Override
    public void buildGraphicsCard(){
        computer.addGraphicsCard("Tämä on toimistokoneen grafiikkakortti");
    }

    @Override
    public void buildHardDrive(){
        computer.addHardDrive("tämä on toimistokoneen kovalevy");
    }
}


