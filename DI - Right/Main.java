public class Main {
    public static void main(String[] args){
        System.out.println("Creating a petrol engine car");
        IEngine petrolEngine = new PetrolEngine(107.2f, 20.4f, 7372.50f);
        Car petrolCar = new Car(petrolEngine);
        System.out.println("Starting a petrol engine car");
        petrolCar.start();

        System.out.println("Creating a diesel engine car");
        IEngine dieselEngine = new DieselEngine(150.5f, 17.3f, 6717.20f, "copper");
        Car dieselCar = new Car(dieselEngine);
        System.out.println("Starting a petrol engine car");
        dieselCar.start();
    }
}
