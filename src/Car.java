import java.util.Locale;

//This class is made to train toString method() and overriding methods
public class Car {

    String make, model, color;
    int year;

    Car(String make, String model, String color, int year){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;

        //System.out.println(toString());

    }

    @Override
    public String toString() {
        return "My car is: " + make + " " + model + ". It's color is " + color + " and year is: " + year;
    }
}
