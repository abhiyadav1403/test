class Vehicle {
    String brand;
    String model;
    int year;
    String fuelType;
    double price;

    public Vehicle(String brand, String model, int year, String fuelType, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.price = price;
    }
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Price: $" + price);
    }

}
class Car extends Vehicle {
    int numberOfDoors;
    boolean isElectric;
    String transmissionType;
    String color;
    
    public Car(String brand, String model, int year, String fuelType, double price, int numberOfDoors, boolean isElectric, String transmissionType, String color){
        super(brand, model, year, fuelType, price);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }
    public void displayCarInfo(){
        displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Is Electric: " + (isElectric ? "Yes" : "No"));
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Color: " + color);
    }

}

public class inheritance {
    public static void main(String[] args){
        Car car1 = new Car("Tesla", "Model S", 2022, "Electric", 79999.99, 4, true, "Automatic", "Red");
        Car car2 = new Car("Ford", "Mustang", 2021, "Gasoline", 55999.99, 2, false, "Manual", "Blue");

        System.out.println("Car 1 Details:");
        car1.displayCarInfo();
        System.out.println("\nCar 2 Details:");
        car2.displayCarInfo();
    }
}