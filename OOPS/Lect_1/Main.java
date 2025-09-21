interface Vehicle {
    void drive();

    void stop();
}

class Car implements Vehicle {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }

    public void stop() {
        System.out.println(brand + " has stopped!!");
    }
}

class Bike implements Vehicle {
    String brand;
    int speed;

    Bike(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void drive() {
        System.out.println(brand + " bike is zooming at " + speed + " km/h");
    }

    public void stop() {
        System.out.println(brand + " bike has stopped.");
    }
}

class Truck implements Vehicle {
    String brand;
    int speed;
    int capacity;

    Truck(String brand, int speed, int capacity) {
        this.brand = brand;
        this.speed = speed;
        this.capacity = capacity;
    }

    public void drive() {
        System.out.println(brand + " truck is carrying " + capacity + " tons with a speed of " + speed + " km/h.");
    }

    public void stop() {
        System.out.println(brand + " truck has stopped.");
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int speed, int batteryCapacity) {
        super(brand, speed);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void drive() {
        System.out.println(brand + " (Electric) is driving silently at " + speed +
                " km/h with battery " + batteryCapacity + " kWh.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Truck("Volvo", 60, 30),
                new Car("Toyota", 120),
                new Bike("Royal Enfield", 100),
                new ElectricCar("Tesla", 100, 75)

        };

        for (Vehicle v : vehicles) {
            v.drive();
            v.stop();
            System.out.println("----------------------------------------------------------");
        }
    }
}
