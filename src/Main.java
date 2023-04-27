import java.lang.reflect.Array;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
    }
}