public class WildernessMap extends Map {

    @Override
    Tile createTile(){
        // 10 is the number of tiles I chose a map should have
            int r = random.nextInt(3);
            switch (r) {
                case 0:
                    return new SwampTile();
                case 1:
                    return new WaterTile();
                case 2:
                    return new ForestTile();

            }
    }
}