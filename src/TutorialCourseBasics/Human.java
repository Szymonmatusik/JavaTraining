package TutorialCourseBasics;

//This class is made to exercise classes and constructors in java
public class Human {

    private String name;
    private int age;
    private double weight;

    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    void eat(){
        System.out.println(this.name + " is eating now.");
    }

    void drink(){
        System.out.println(this.name + " is drinking now.");
    }

}
