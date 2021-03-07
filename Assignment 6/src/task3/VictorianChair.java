package task3;

public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Chair has victorian legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on victorian chair.");
    }
}
