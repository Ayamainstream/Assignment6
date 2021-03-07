package task4;

public class SimpleHouseBuilder implements HouseBuilder {
    private House house;

    public SimpleHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        house.setWalls("Simple walls.");
    }

    @Override
    public void buildDoors() {
        house.setDoors("Simple doors.");
    }

    @Override
    public void buildWindows() {
        house.setWindows("Simple windows.");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Simple roof.");
    }

    @Override
    public void buildGarage() {
        house.setGarage("Simple garage.");
    }

    @Override
    public House getResult() {
        return this.house;
    }
}
