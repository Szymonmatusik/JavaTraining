import java.util.Locale;

//This class is made to train toString() method and overriding methods
public class Car {

    String make, model, color;
    int year;

    Garage garage;

    Car(String make, String model, String color, int year, Garage garage){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.garage = garage;
    }

    public void parkCar(){
        if (this.garage.isGarageCorrect){
            System.out.println(toString());
        }
        else {
            System.out.println("Car cannot park in this garage");
        }
    }

    @Override
    public String toString() {
        return "My car is: " + make + " " + model + ". It's color is " + color + " and year is: " + year +
                ". It's parked in the garage on the " + garage.side + " side, on the floor number " + garage.floor +
                " and in the place number " + garage.place + ".";
    }
}
