package design.patterns.creational.Builder;

public abstract class House {
    protected Floor floor;
    protected Walls walls;
    protected Roof roof;

    public Walls getWalls(){
        return walls;
    }
    public Floor getFloor(){
        return floor;
    }

    public Roof getRoof(){
        return roof;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
    public void setWalls(Walls walls) {
        this.walls = walls;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public abstract String getRepresentation();
}
