package TutorialCourseBasics;

public class TutorialMainProgram {
    public static void main() {
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
    }
}
