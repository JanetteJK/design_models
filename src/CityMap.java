public class CityMap extends Map {

    @Override
    Tile createTile() {
            int r = random.nextInt(3);
            switch (r) {
                case 0:
                    return new RoadTile();
                case 1:
                    return new ForestTile();
                case 2:
                    return new BuildingTile();
            }
    }
}
