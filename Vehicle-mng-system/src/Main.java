import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota", "Corolla", 2022));
        vehicles.add(new Motorcycle("Yamaha", "MT-07", 2021));
        vehicles.add(new Truck("Volvo", "FH16", 2017));

        for (Vehicle v : vehicles) {
            System.out.println("----------------------");
            v.displayInfo();

            if (v instanceof Drivable drivable) {
                drivable.start();
                drivable.accelerate();
                drivable.brake();
            }

            if (v instanceof Serviceable serviceable) {
                if (serviceable.needsService()) {
                    serviceable.performService();
                } else {
                    System.out.println("No service needed.");
                }
            }
        }
    }
}