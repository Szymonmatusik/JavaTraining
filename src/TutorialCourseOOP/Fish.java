//This class is created to train Interfaces
package TutorialCourseOOP;

public class Fish extends Animal implements Prey, Predator{

    @Override
    public void flee() {
        System.out.println("The fish is fleeing.");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting.");
    }

    @Override
    void speak() {
        System.out.println("Fish goes *bul bul*");
    }
}
