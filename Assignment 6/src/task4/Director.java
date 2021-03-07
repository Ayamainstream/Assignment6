package task4;

public class Director {
    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    public House getResult(){
        return this.houseBuilder.getResult();
    }

    public void constructHouse(){
        this.houseBuilder.buildWalls();
        this.houseBuilder.buildDoors();
        this.houseBuilder.buildWindows();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildGarage();
    }
}
