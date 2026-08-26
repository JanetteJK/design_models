import java.util.ArrayList;
import java.util.Random;

public abstract class Map {
    public ArrayList<Tile> tiles = new ArrayList<>();
    public Random random = new Random();



    abstract void createTile();

    // shows the map on the screen
    public void display(){
        System.out.println("pääsee tänne mutta lista on tyhjä");
        for (Tile tile : tiles) {
            System.out.println(tile.getCharacter() + " ");
            System.out.println("kakka");
        }
    }


}
