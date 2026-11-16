import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<String> parts;


    public Computer() {
        this.parts =new ArrayList<>();
    }

    public void addProcessor(String processor) {
        this.parts.add(processor);
    }

    public void addRAM(String ramSize){
        this.parts.add(ramSize + " GB");
    }

    public void addHardDrive(String hardDrive){
        this.parts.add(hardDrive);
    }

    public void addGraphicsCard(String graphicsCard){
        this.parts.add(graphicsCard);
    }

    public void addOS(String os){
        this.parts.add(os);
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            sb.append(part).append("\n");
        }
        return sb.toString();
    }

}
