public class CityMap extends Map {

    @Override
    void createTile(int size) {
        for (int i = 0; i < size; i++) {
            int r = random.nextInt(3);
            switch (r) {
                case 0:
                    tiles.add(new RoadTile());
                case 1:
                    tiles.add(new ForestTile());
                case 2:
                    tiles.add(new BuildingTile());
            }
        }
    }
}
