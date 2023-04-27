import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Garage {
    boolean isGarageCorrect = false;
    int floor, place;
    final int MAXIMUM_PLACE = 99, MINIMUM_PLACE = 0, MAXIMUM_FLOOR = 6, MINIMUM_FLOOR = 0;
    String side;
    public static final List<String> sideList = List.of("south", "west", "east", "north");


    Garage(String side, int floor, int place){
        if (!sideList.contains(side)
                || !(MINIMUM_FLOOR <= floor && floor <= MAXIMUM_FLOOR )
                || !(MINIMUM_PLACE <= place && place <= MAXIMUM_PLACE )){

            System.out.println("Garage has incorrect side, floor or place parameter!");
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
