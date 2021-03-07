package task2;

public class RoadLogistics extends Logistics {
    @Override
    public Logistics createTransport() {
        return new RoadLogistics();
    }
}
