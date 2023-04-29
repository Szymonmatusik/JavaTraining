package TutorialCourseOOP;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

            //Interface - a template that can be applied to a class. It is similar to inheritance but specifies
            //what class has to/must do. Classes can apply more than one interface, inheritance is limited to 1 super.

            Rabbit rabbit = new Rabbit();
            rabbit.flee();

            Hawk hawk = new Hawk();
            hawk.hunt();

            Fish fish = new Fish();
            fish.flee();
            fish.hunt();

            //polymorphism - the ability of the object to identify as more than one type. If class extends other class
            //it automatically becomes the type of that other class like below.
            Car car = new Car("Mercedes", "CLS", "red", 2023, garageWest);
            Bicycle bicycle = new Bicycle("Male", "Mountain",23);
            Boat boat  = new Boat("blue", 4);

            List<Vehicle> vehiclesList = List.of(car, bicycle, boat); //polymorphism

            for (Vehicle vehicle : vehiclesList){
                    System.out.println(vehicle.vehicleType);
                    vehicle.go();
                    vehicle.stop();
                    System.out.println();
            }

            //Dynamic Polymorphism (polymorphism = many shapes/forms, dynamic = after compilation (during runtimes)
            //ex. a corvette is a: corvette, car, vehicle, object

            Animal animalUnknown;

            Scanner scanner = new Scanner(System.in);
            int animalType;


            while (true){
                    System.out.print("What type of animal would you like the animal to be " +
                                        "(1=dog, 2=cat, 3=fish, 4=rabbit, 5=hawk): ");
                    animalType = scanner.nextInt();


                    if (animalType == 1){
                            animalUnknown = new Dog();
                            break;
                    }
                    else if (animalType == 2){
                            animalUnknown = new Cat();
                            break;
                    }
                    else if (animalType == 3){
                            animalUnknown = new Fish();
                            break;
                    }
                    else if (animalType == 4){
                            animalUnknown = new Rabbit();
                            break;
                    }
                    else if (animalType == 5){
                            animalUnknown = new Hawk();
                            break;
                    }
                    else{
                            System.out.println("Animal type not correct. Try again!");
                    }
            }
            animalUnknown.speak();

    }
}
