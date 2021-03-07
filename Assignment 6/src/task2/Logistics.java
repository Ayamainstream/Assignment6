package task2;

public abstract class Logistics {
    public void planDelivery(){
        Transport t = (Transport) createTransport();
    }
    public abstract Logistics createTransport();
}
