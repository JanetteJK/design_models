public class WildernessMap extends Map {
    @Override
    public Tile createTile(){
        return new SwampTile();
    }
}