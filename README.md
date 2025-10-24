
```markdown
# Vehicle Management System

A simple Java project to manage different types of vehicles in a garage.  
This project demonstrates the use of **interfaces**, **abstract classes**, **inheritance**, **polymorphism**, and **serviceable vehicles**.

---

## Features

- `Drivable` interface with basic vehicle behaviors:
  - `start()`
  - `accelerate()`
  - `brake()`

- Abstract `Vehicle` class:
  - Common properties: `brand`, `model`, `year`
  - Concrete method: `displayInfo()`
  - Abstract method: `getFuelType()`

- Concrete vehicle classes:
  - `Car`
  - `Motorcycle`
  - `Truck`

- `Serviceable` interface for vehicles that need maintenance (implemented by `Truck`):
  - `performService()`
  - `needsService()`

- Main program demonstrates:
  - Polymorphism through `Vehicle` list
  - Calling common methods
  - Checking if a vehicle is serviceable

---



```
## Project Structure
```

VehicleManagementSystem/
│
├─ src/
│   ├─ Drivable.java
│   ├─ Vehicle.java
│   ├─ Serviceable.java
│   ├─ Car.java
│   ├─ Motorcycle.java
│   ├─ Truck.java
│   └─ Main.java
```
## How to Run
#### 1. **Compile all Java files**:
````

```bash
javac src/*.java
````

#### 2. **Run the program**: 

```bash
java -cp src Main
```

#### 3. **Expected Output**:

You will see vehicle details printed, followed by the actions of starting, accelerating, braking, and service status (if applicable).

---

## Example Output

```
----------------------
Brand: Toyota
Model: Corolla
Year: 2022
Fuel Type: Petrol
Car is starting...
Car is accelerating...
Car is braking...
----------------------
Brand: Yamaha
Model: MT-07
Year: 2021
Fuel Type: Petrol
Motorcycle is starting...
Motorcycle is accelerating...
Motorcycle is braking...
----------------------
Brand: Volvo
Model: FH16
Year: 2017
Fuel Type: Diesel
Truck is starting...
Truck is accelerating...
Truck is braking...
Performing service on the truck...
```

---


