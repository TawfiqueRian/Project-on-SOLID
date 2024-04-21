/**
 * Title: This program demonstrates the Liskov Substitution Principle by modeling different types of vehicles.
 * Author: Md. Tawfiqul Islam, Undergraduate student, Khulna University
 */

// Abstract class for vehicles
abstract class Vehicle {
    private String model;
    private String color;

    /**
     * Constructor for Vehicle class.
     * @param model The model of the vehicle.
     * @param color The color of the vehicle.
     */
    public Vehicle(String model, String color) {
        this.model = model;
        this.color = color;
    }

    /**
     * Returns the model of the vehicle.
     * @return The model of the vehicle.
     */
    public String getModel() {
        return model;
    }

    /**
     * Returns the color of the vehicle.
     * @return The color of the vehicle.
     */
    public String getColor() {
        return color;
    }

    /**
     * Abstract method to start the vehicle.
     */
    public abstract void start();
}

// Concrete class for Car
class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Constructor for Car class.
     * @param model The model of the car.
     * @param color The color of the car.
     * @param numberOfDoors The number of doors of the car.
     */
    public Car(String model, String color, int numberOfDoors) {
        super(model, color);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Starts the car.
     */
    @Override
    public void start() {
        System.out.println("Starting the car " + getModel() + "...");
    }
}

// Concrete class for Motorcycle
class Motorcycle extends Vehicle {
    private String type;

    /**
     * Constructor for Motorcycle class.
     * @param model The model of the motorcycle.
     * @param color The color of the motorcycle.
     * @param type The type of the motorcycle (e.g., cruiser, sport).
     */
    public Motorcycle(String model, String color, String type) {
        super(model, color);
        this.type = type;
    }

    /**
     * Starts the motorcycle.
     */
    @Override
    public void start() {
        System.out.println("Starting the motorcycle " + getModel() + "...");
    }
}

public class lislov_substitution_principle {
    /**
     * Main method to test the different types of vehicles.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Creating instances of different vehicles
        Car car = new Car("Toyota Camry", "Blue", 4);
        Motorcycle motorcycle = new Motorcycle("Honda CBR", "Red", "Sport");

        // Testing starting functionality
        car.start();
        motorcycle.start();
    }
}
