package task2;

public class Main {
    public static void main(String[] args) {
        RoadLogistics r = new RoadLogistics();
        SeaLogistics s = new SeaLogistics();

        System.out.println(r.createTransport());
        System.out.println(s.createTransport());
    }
}
