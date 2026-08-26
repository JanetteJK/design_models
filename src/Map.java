import java.util.Random;

public abstract class Map {
    protected Tile[][] tiles;
    public Random random = new Random();

    public Map(){
        tiles = new Tile[10][10];

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                tiles[row][col] = createTile();
            }
        }
    }

    abstract Tile createTile();

    // shows the map on the screen
    public void display() {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(tiles[row][col].getCharacter() + " ");
            }
            System.out.println();
        }
    }


}
