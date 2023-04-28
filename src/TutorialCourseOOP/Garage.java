package TutorialCourseOOP;//This class is made to learn how to pass objects as parameters
import java.util.List;

public class Garage {
    boolean isGarageCorrect;
    int floor, place;
    final int MINIMUM_PLACE = 0, MAXIMUM_PLACE = 99, MINIMUM_FLOOR = 0, MAXIMUM_FLOOR = 6;
    String side;
    public static final List<String> sideList = List.of("south", "west", "east", "north");


    public Garage(String side, int floor, int place){
        if (!sideList.contains(side)
                || !(MINIMUM_FLOOR <= floor && floor <= MAXIMUM_FLOOR )
                || !(MINIMUM_PLACE <= place && place <= MAXIMUM_PLACE )){

            System.out.println("TutorialCourseOOP.Garage has incorrect side, floor or place parameter!");
            this.isGarageCorrect = false;
        }
        else {
            this.side = side;
            this.floor = floor;
            this.place = place;
            this.isGarageCorrect = true;
        }
    }
}

