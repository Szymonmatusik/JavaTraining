//New class created to learn inheritance in Java
public class Bicycle extends Vehicle{

    String gender, model;
    int size;

    Bicycle(String gender, String model, int size){
        this.gender = gender;
        this.model = model;
        this.size = size;

        super.vehicleType = "bicycle";

    }

    @Override
    void go() {
        System.out.println("The cyclist is riding.");
    }

    @Override
    void stop() {
        System.out.println("The cyclist is stopping.");
    }
}
