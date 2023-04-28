//New class created to learn inheritance in Java
public class Bicycle extends Vehicle{

    String gender, model;
    int size;

    Bicycle(String gender, String model, int size){
        this.gender = gender;
        this.model = model;
        this.size = size;

        super.vehicle = "bicycle";

    }
}
