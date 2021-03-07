package task2;

public class SeaLogistics extends Logistics {
    @Override
    public Logistics createTransport() {
        return new SeaLogistics();
    }
}
