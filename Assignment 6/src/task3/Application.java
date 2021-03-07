package task3;

public class Application {
    private Chair chair;
    private CoffeeTable coffeeTable;
    private Sofa sofa;

    public Application(FurnitureFactory factory){
        chair = factory.createChair();
        coffeeTable = factory.createCoffeeTable();
        sofa = factory.createSofa();
    }
    public void hasLeg(){
        chair.hasLegs();
        coffeeTable.hasLegs();
        sofa.hasLegs();
    }
    public void sitOn(){
        chair.sitOn();
    }
}
