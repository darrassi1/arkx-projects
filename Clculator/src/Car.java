class Car extends Vehicle implements Drivable {

    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public String getFuelType() {
        return "Petrol"; // Example fuel type
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking...");
    }
}