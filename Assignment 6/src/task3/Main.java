package task3;

public class Main {
    private static Application configureApplication(){
        Application app;
        FurnitureFactory factory;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.contains("victorian")){
            factory = new VictorianFurnitureFactory();
        }else {
            factory = new ModernFurnitureFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args){
        Application app = configureApplication();
        app.hasLeg();
    }
}
