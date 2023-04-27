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

        Car car = new Car("Ford", "Mustang", "red", 2022);
    }
}