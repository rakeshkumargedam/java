package design.patterns.creational.Builder;

public class HouseDirector {

    public House constructHouse(HouseBuilder houseBuilder){
        House house = houseBuilder.createHouse();
        System.out.println(house.getRepresentation());
        house.setFloor(houseBuilder.createFloor());
        System.out.println(house.getFloor().getRepresentation());
        house.setRoof(houseBuilder.createRoof());
        System.out.println(house.getRoof().getRepresentation());
        house.setWalls(houseBuilder.createWalls());
        System.out.println(house.getWalls().getRepresentation());
        return house;

    }
}
