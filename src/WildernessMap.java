public class WildernessMap extends Map {

    @Override
    void createTile(){
        for (int i = 0; i < 10; i++) {
            int r = random.nextInt(3);
            switch (r) {
                case 0:
                    tiles.add(new SwampTile()); break;
                case 1:
                    tiles.add(new WaterTile()); break;
                case 2:
                    tiles.add(new ForestTile()); break;
            }
        }
    }
}