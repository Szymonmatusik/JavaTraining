//This class is created to train Interfaces
package TutorialCourseOOP;

public class Hawk extends Animal implements Predator {

    @Override
    public void hunt() {
        System.out.println("The hawk is hunting");
    }

    @Override
    void speak() {
        System.out.println("Hawk goes hiuuu xD");
    }
}
