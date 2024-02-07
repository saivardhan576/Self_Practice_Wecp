package MS1;
import java.util.*;
public class InterativeRecipePlanner {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to the Interactive Recipe Planner!");
        System.out.println("What is the name of the dish you want to prepare?");
        String dish=s.nextLine();
        System.out.println("How many servings do you want to make?");
        int servings=s.nextInt();
        System.out.println("What are the main ingredients for the dish?");
        String ingre=s.nextLine();
        s.next();
        System.out.println("Do you have any dietary restrictions or preferences?");
        String pref=s.next();
        System.out.println("What is the estimated cooking time for the dish?");
        int time=s.nextInt();

        System.out.println("Thank you for planning your recipe!");
        System.out.println("Recipe Details:");
        System.out.println("Dish Name: "+dish);
        System.out.println("Servings: "+servings);
        System.out.println("Main Ingredients: "+ingre);
        System.out.println("Dietary Preferences: "+pref);
        System.out.println("Cooking Time: "+time);
        System.out.println("Happy Cooking");



    }
    
}
