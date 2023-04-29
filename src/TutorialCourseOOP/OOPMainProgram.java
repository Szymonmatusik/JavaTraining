package TutorialCourseOOP;


import java.util.ArrayList;

public class OOPMainProgram {
    public static void main(String[] args) {
            //TutorialCourseOOP.Car car = new TutorialCourseOOP.Car("Ford", "Mustang", "red", 2022,);

            //Creating the array of objects of type TutorialCourseOOP.Food
            Food[] refrigerator = new Food[3];

            Food meat = new Food("meat");
            Food apple = new Food("apple");
            Food milk = new Food("milk");

            refrigerator[0] = meat;
            refrigerator[1] = apple;
            refrigerator[2] = milk;

            ArrayList<Food> ingredients = new ArrayList<>();

            ingredients.add(meat);
            ingredients.add(milk);
            ingredients.add(apple);

            for(Food foodName : ingredients){
                System.out.println(foodName.name);
            }
            for(Food foodName : refrigerator){
                System.out.println(foodName.name);
            }

            //Testing the objects as parameters
            Garage garageWest = new Garage("west", 3, 50);
            Garage garageNorth = new Garage("north", 6, 24);
            Garage garageSouth = new Garage("south", 1, 78);

            Car mercedes = new Car("Mercedes", "CLA200", "black", 2023, garageWest);
            Car KIA = new Car("KIA", "Ceed", "red", 2009, garageNorth);
            Car ford = new Car("Ford", "Focus", "silver", 2004, garageSouth);

            mercedes.parkCar();
            KIA.parkCar();
            ford.parkCar();

            //Testing the static keyword
            Friend Alex = new Friend("Alex", 12);
            Friend Tom = new Friend("Tom", 16);
            Friend Elle = new Friend("Elle", 22);
            Friend Jessica = new Friend("Jessica", 17);

            System.out.println((Friend.numberOfFriends));

            System.out.println("Nick proposal: " + Friend.createNick(Alex));
            System.out.println("Nick proposal: " + Friend.createNick(Tom));
            System.out.println("Nick proposal: " + Friend.createNick(Elle));
            System.out.println("Nick proposal: " + Friend.createNick(Jessica));

            Friend.displayFriends();

            //Inheritance training
            //Using actually existing instances of TutorialCourseOOP.Car class (line 62..64)
            mercedes.go();
            mercedes.stop();

            Bicycle bicycleBlue = new Bicycle("male", "blue", 21);
            Bicycle bicycleRed = new Bicycle("female", "red", 19);

            bicycleRed.go();
            bicycleBlue.go();
            bicycleRed.stop();
            bicycleBlue.stop();

            //Training on overriding methods
            //Overridden method speak()
            Dog dog = new Dog();
            dog.speak();

            //Overrode method speak()
            Animal animal = new Animal();
            animal.speak();

            //Super keyword exercise
            Hero hero1 = new Hero("Batman", 42, "Seeing in darkness");
            Hero hero2 = new Hero("Superman", 35, "Flying");
            Hero hero3 = new Hero("Captain America", 30, "Shield");

            Person Szymon = new Person("Szymon", 23);

            //Abstract classes are classes which cannot be instantiated but can have a subclass
            //Abstract methods are declared without implementation

            //Access modifiers - reduce the possibilities of developer to use certain fragments of code

            //Encapsulation - attributes of a class will be hidden or private and can be accessed only through special
            //methods - setters and getters. Always make attributes private if you don't want to make them public/protected

            CarEncapsulation carEncapsulation = new CarEncapsulation("Chevrolet", "Camaro", 2023);

            //System.out.println(carEncapsulation.make); - not possible because of private access modifier

            //Getters methods for created object
            System.out.println(carEncapsulation.getMake() + " " + carEncapsulation.getModel() + " is "
                                + carEncapsulation.getYear() + " year." );

            //Setter methods for created object
            carEncapsulation.setMake("Fiat");
            carEncapsulation.setModel("Punto");
            carEncapsulation.setYear(2000);

            System.out.println(carEncapsulation.getMake() + " " + carEncapsulation.getModel() + " is "
                                + carEncapsulation.getYear() + " year." );

            //Copying objects
            CarEncapsulation car1 = new CarEncapsulation("Ford", "Mustang", 2022);
            //CarEncapsulation car2 = new CarEncapsulation("Ford", "Mustang", 2022);

            //Overriding constructor to copy object
            CarEncapsulation car2 = new CarEncapsulation(car1);

            System.out.println();
            System.out.println(car1);
            System.out.println(car2);
            System.out.println();
            System.out.println(car1.getMake());
            System.out.println(car1.getModel());
            System.out.println(car1.getYear());
            System.out.println();
            System.out.println(car2.getMake());
            System.out.println(car2.getModel());
            System.out.println(car2.getYear());

            //Copy values from car1 to car2
            //car2.copy(car1);
            System.out.println();
            System.out.println(car2.getMake());
            System.out.println(car2.getModel());
            System.out.println(car2.getYear());



    }
}
