public class WildernessMap extends Map {

    @Override
    Tile createTile(){
        int r = random.nextInt(3);
        switch (r) {
            case 0: return new SwampTile();
            case 1: return new WaterTile();
            case 2: return new ForestTile();
            default: return new SwampTile();
        }
    }
}