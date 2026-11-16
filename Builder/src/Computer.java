public class Computer {
    private String processor;
    private String ramSize;
    private String hardDrive;
    private String graphicsCard;
    private String os;

    public Computer() {
        this.processor = "";
        this.ramSize = "";
        this.hardDrive = "";
        this.graphicsCard = "";
        this.os = "";
    }

    public void addProcessor(String processor) {
        this.processor = processor;
    }

    public void addRAM(String ramSize){
        this.ramSize = ramSize + "GB";
    }

    public void addHardDrive(String hardDrive){
        this.hardDrive = hardDrive;
    }

    public void addGraphicsCard(String graphicsCard){
        this.graphicsCard = graphicsCard;
    }

    public void addOS(String os){
        this.os = os;
    }
}
