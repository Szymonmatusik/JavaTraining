package TutorialCourseOOP;

//New class created to learn inheritance in Java
public class Bicycle extends Vehicle {

    String gender, model;
    int size;

    public Bicycle(String gender, String model, int size){
        this.gender = gender;
        this.model = model;
        this.size = size;

        super.vehicleType = "bicycle";

    }

    @Override
    public void go() {
        System.out.println("The cyclist is riding.");
    }

    @Override
    public void stop() {
        System.out.println("The cyclist is stopping.");
    }
}
