package task4;

public class HouseWithGardenBuilder implements HouseBuilder{
    private House house;

    public HouseWithGardenBuilder(){
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        house.setWalls("Walls for house with garden.");
    }

    @Override
    public void buildDoors() {
        house.setDoors("Doors for house with garden.");
    }

    @Override
    public void buildWindows() {
        house.setWindows("Windows for house with garden.");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Roof for house with garden.");
    }

    @Override
    public void buildGarage() {
        house.setGarage("Garage for house with garden.");
    }

    @Override
    public House getResult() {
        return this.house;
    }
}
