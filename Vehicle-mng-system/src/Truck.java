class Truck extends Vehicle implements Drivable, Serviceable {

    public Truck(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public void start() {
        System.out.println("Truck is starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Truck is braking...");
    }

    @Override
    public void performService() {
        System.out.println("Performing service on the truck...");
    }

    @Override
    public boolean needsService() {
        return (2025 - year) > 5; // Needs service if older than 5 years
    }
}

