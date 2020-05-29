public class Car {
    private final IEngine engine;

    public Car(IEngine engine) {

        this.engine = engine;
    }

    public void start() {
        System.out.println("Car is starting");
        engine.run();
    }
}
