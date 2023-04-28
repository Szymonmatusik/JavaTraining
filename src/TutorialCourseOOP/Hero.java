package TutorialCourseOOP;

public class Hero extends Person {

    String power;

    public Hero(String name, int age, String power){
        super(name, age);
        this.power = power;

        System.out.println(this);

    }


    @Override
    public String toString(){
        return "This hero is: " + super.name + ". Their age is: " + super.age + " and superpower is: " + this.power;

    }

}
