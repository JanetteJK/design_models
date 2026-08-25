import java.util.ArrayList;
import java.util.Random;

public abstract class Map {
    public ArrayList<Tile> tiles = new ArrayList<>();
    public Random random = new Random();


    // creates a new tile in the chosen map type
    abstract void createTile(int size);

    // shows the map on the screen
    public void display(int a){
        for (int i = 0; i < a; i++) {
            System.out.println(tiles.get(i).getCharacter() + " ");
        }
    }


}
