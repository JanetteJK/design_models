public class WildernessMap extends Map {

    @Override
    void createTile(){
        // 10 is the number of tiles I chose a map should have
        for (int i = 0; i < 10; i++) {
            int r = random.nextInt(3);
            switch (r) {
                case 0:
                    tiles.add(new SwampTile());
                    System.out.println("suo"); break;
                case 1:
                    tiles.add(new WaterTile());
                    System.out.println("vesi"); break;
                case 2:
                    tiles.add(new ForestTile());
                    System.out.println("mettä"); break;
            }
        }
    }
}