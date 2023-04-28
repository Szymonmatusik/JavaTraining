package TutorialCourseOOP;

//This class is made to train toString() method and overriding methods
public class Car extends Vehicle {

    String make, model, color;
    int year;

    Garage garage;

    public Car(String make, String model, String color, int year, Garage garage){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.garage = garage;

        super.vehicleType = "car";
    }

    public void parkCar(){
        if (this.garage.isGarageCorrect){
            System.out.println(this);
        }
        else {
            System.out.println("TutorialCourseOOP.Car cannot park in this garage");
        }
    }

    @Override
    public String toString() {
        return "My car is: " + make + " " + model + ". It's color is " + color + " and year is: " + year +
                ". It's parked in the garage on the " + garage.side + " side, on the floor number " + garage.floor +
                " and in the place number " + garage.place + ".";
    }

    @Override
    public void go(){
        System.out.println("The driver is driving the car.");
    }

    @Override
    public void stop(){
        System.out.println("The driving is stopping a car.");
    }
}
