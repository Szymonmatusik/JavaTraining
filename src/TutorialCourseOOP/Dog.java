package TutorialCourseOOP;

//This class is created to exercise method overwriting
public class Dog extends Animal {

    @Override
    void speak(){
        System.out.println("The dog goes bark");
    }

}
