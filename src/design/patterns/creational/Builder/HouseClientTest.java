package design.patterns.creational.Builder;

public class HouseClientTest {

    public static void main(String args[]) {
        HouseDirector houseDirector = new HouseDirector();
        HouseBuilder woodHouseBuilder = new WoodBuilder();
        HouseBuilder brickHouseBuilder = new BrickBuilder();
        //Building a Wooden House
        House woodHouse = houseDirector.constructHouse(woodHouseBuilder);
        System.out.println();
        //Building a Brick House
        House brickHouse = houseDirector.constructHouse(brickHouseBuilder);
    }
}
