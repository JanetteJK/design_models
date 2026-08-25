public class CityMap extends Map {
    @Override
    public Tile createTile(){
        return new BuildingTile();
    }


}
