public class BuildingTile implements Tile {
    public void action() {
        System.out.println("I think this building looks haunted");
    }
    public String getCharacter() {
        return "B";
    }

    public String getDescription() {
        return "building";
    }
}
