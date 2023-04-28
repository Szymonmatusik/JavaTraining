package TutorialCourseBasics;

import java.util.ArrayList;

//This class is created to test overloaded constructors
public class Pizza {

    String bread, topping, sauce, cheese;
    ArrayList<String> ingredientsList = new ArrayList<>();

    public Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;

        ingredientsList.add(this.bread);
        ingredientsList.add(this.sauce);

        System.out.println("This is the cheapest pizza.");

        listIngredients();
    }

    public Pizza(String bread, String sauce, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.topping = topping;

        ingredientsList.add(this.bread);
        ingredientsList.add(this.sauce);
        ingredientsList.add(this.topping);

        System.out.println("This is pizza without cheese.");

        listIngredients();
    }

    public Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

        ingredientsList.add(this.bread);
        ingredientsList.add(this.sauce);
        ingredientsList.add(this.cheese);
        ingredientsList.add(this.topping);

        System.out.println("This is a full option pizza.");

        listIngredients();
    }

    public void listIngredients(){
        System.out.println("This are the ingredients of your pizza: ");

        for(int i=1; i<=this.ingredientsList.size(); i++){
            System.out.println(i + ". " + this.ingredientsList.get(i-1));
        }
    }
}
