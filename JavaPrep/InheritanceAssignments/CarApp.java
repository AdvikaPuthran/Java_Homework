package inheritanceAssignment;

class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("The vehicle is in motion.");
    }
}

class Car extends Vehicle {
    String color;

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

    public void honk() {
        System.out.println("Honk! Honk!");
    }
}

public class CarApp {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2022, "Blue");

        myCar.drive(); // Call the drive method from the Vehicle class
        myCar.honk();  // Call the honk method from the Car class
    }
}


