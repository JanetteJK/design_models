import java.util.Random;

public abstract class Map {
    protected Tile[][] tiles;
    public Random random = new Random();

    public Map(){

    }

    abstract Tile createTile();

    // shows the map on the screen
    public void display(){
        System.out.println("pääsee tänne mutta lista on tyhjä");
        for (Tile tile : tiles) {
            System.out.println(tile.getCharacter() + " ");
            System.out.println("kakka");
        }
    }


}
