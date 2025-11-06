class Vehicle {
    String brand;

    public Vehicle(String brand) {
    
        this.brand = brand;
    }

    public void display() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    int wheels;

    public Car(String brand, int wheels) {
        super(brand);
        this.wheels = wheels;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Wheels: " + wheels);
    }
}

class ElectricCar extends Car {
    int battery;

    public ElectricCar(String brand, int wheels, int battery) {
        super(brand, wheels);
        this.battery = battery;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Battery: " + battery + " kWh");
    }
}

public class Prog3 {
    public static void main(String[] args) {
      
        Car mycar = new Car("Toyota", 4);
        mycar.display();

        System.out.println(); 

  
        ElectricCar myelectric = new ElectricCar("Tesla", 4, 100);
        myelectric.display();
    }
}

