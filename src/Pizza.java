import java.util.ArrayList;

//This class is created to test overloaded constructors
public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;

        ArrayList<String> ingredientsList = new ArrayList<>();
        ingredientsList.add(this.bread);
        ingredientsList.add(this.sauce);

        System.out.println("This is the cheapest pizza.");

        listIngredients(ingredientsList);
    }

    Pizza(String bread, String sauce, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.topping = topping;

        ArrayList<String> ingredientsList = new ArrayList<>();
        ingredientsList.add(this.bread);
        ingredientsList.add(this.sauce);
        ingredientsList.add(this.topping);

        System.out.println("This is pizza without cheese.");

        listIngredients(ingredientsList);
    }

    Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

        ArrayList<String> ingredientsList = new ArrayList<>();
        ingredientsList.add(this.bread);
        ingredientsList.add(this.sauce);
        ingredientsList.add(this.cheese);
        ingredientsList.add(this.topping);

        System.out.println("This is a full option pizza.");

        listIngredients(ingredientsList);
    }

    void listIngredients(ArrayList<String> ingredients){
        System.out.println("This are the ingredients of your pizza: ");

        for(int i=1; i<=ingredients.size(); i++){
            System.out.println(i + ". " + ingredients.get(i-1));
        }
    }
}
