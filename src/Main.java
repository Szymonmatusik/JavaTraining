import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Rick", 60, 75.5);
        Human human2 = new Human("Morty", 15, 55.5);

        human1.eat();
        human2.drink();

        human1.drink();
        human2.eat();

        System.out.println();

        DiceRoller diceRoller = new DiceRoller();

        for(int i=1; i<=10; i++){
            diceRoller.roll();
        }

        System.out.println();

        Pizza pizza1 = new Pizza("crusty bread", "tomato sauce", "mozzarella", "salami");
        Pizza pizza2 = new Pizza("standard bread", "tomato sauce" , "pepper");
        Pizza pizza3 = new Pizza("oak bread", "creamy sauce" );

        System.out.println();

        //Car car = new Car("Ford", "Mustang", "red", 2022,);

        //Creating the array of objects of type Food
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
        //Using actually existing instances of Car class (line 62..64)
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


    }
}