package TutorialCourseBasics;

import java.util.Random;

public class DiceRoller {

    int number;
    public DiceRoller(){
        roll();

    }

    public void roll(){
        Random random = new Random();
        this.number = random.nextInt(1, 6);
        System.out.println("Diced number is: " + this.number);

    }

}

