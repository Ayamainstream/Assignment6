package task4;

public class Application {
    public static void main(String[] args) {
        HouseBuilder shb = new SimpleHouseBuilder();
        Director director = new Director(shb);

        director.constructHouse();

        House house = director.getResult();

        System.out.println("Builder constructed: " + house);
    }
}
