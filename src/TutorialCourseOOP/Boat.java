//This class is added to train polymorphism
package TutorialCourseOOP;

public class Boat extends Vehicle{

    String color;
    int numberOfSeats;

    Boat(String color, int numberOfSeats){
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        super.vehicleType = "Boat";
    }

    @Override
    void go() {
        System.out.println("The boat is going forward.");
    }

    @Override
    void stop() {
        System.out.println("The boat is stopping on the sea.");
    }

}
