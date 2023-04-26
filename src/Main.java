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
    }
}