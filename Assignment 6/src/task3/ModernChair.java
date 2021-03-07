package task3;

public class ModernChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Chair has modern legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on modern chair");
    }
}
