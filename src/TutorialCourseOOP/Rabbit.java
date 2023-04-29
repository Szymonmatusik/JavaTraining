//This class is created to train Interfaces
package TutorialCourseOOP;

public class Rabbit extends Animal implements Prey {

    @Override
    public void flee() {
        System.out.println("The rabbit is fleeing.");
    }

    @Override
    void speak() {
        System.out.println("Rabbit goes *ssss*");
    }
}
