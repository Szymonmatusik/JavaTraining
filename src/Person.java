//This class allows to exercise super keyword also used in Vehicle-Car Part

public class Person {

    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;

        System.out.println(this);
    }

    @Override
    public String toString(){
        return "This person is: " + this.name + ". Their age is: " + this.age;

    }

}

