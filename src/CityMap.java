public class CityMap extends Map {

    @Override
    void createTile() {
        for (int i = 0; i < 10; i++) {
            int r = random.nextInt(3);
            switch (r) {
                case 0:
                    tiles.add(new RoadTile());
                    System.out.println("tie"); break;
                case 1:
                    tiles.add(new ForestTile());
                    System.out.println("mettä"); break;
                case 2:
                    tiles.add(new BuildingTile());
                    System.out.println("tönö"); break;
            }
        }
    }
}
