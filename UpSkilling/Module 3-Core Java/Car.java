public class Car {

   
    String make;
    String model;
    int year;

   
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

   
    public void displayDetails() {
        System.out.println("Car Details");
        System.out.println("-----------");
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println();
    }

    
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Fortuner", 2023);

       
        Car car2 = new Car("Hyundai", "Creta", 2022);

      
        car1.displayDetails();
        car2.displayDetails();
    }
}