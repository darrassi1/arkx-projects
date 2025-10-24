class Motorcycle extends Vehicle implements Drivable {

    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Motorcycle is braking...");
    }
}