import java.util.Random;

public abstract class Map {
    public Random random = new Random();


    // creates a new tile in the chosen map type
    abstract Tile createTile();

    // shows the map on the screen
    public void display(){

    }


}
