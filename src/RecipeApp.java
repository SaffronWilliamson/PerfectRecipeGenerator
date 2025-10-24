import java.util.Scanner;
public class RecipeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //add greeting page
        boolean start = GreetingPage.showGreetingPage();

        //end programme and close scanner
        if (!start) {
            scanner.close();
            return;
        }

        //gather user info to get the perfect recipe
        boolean repeatProgramme = true;


        while (repeatProgramme) {
            System.out.println("\nAre you vegetarian or vegan? (yes/no)");
            String vegetarian = scanner.nextLine();

            System.out.println("Do you like spicy food? (yes/no)");
            String spicy = scanner.nextLine();

            System.out.println("Do you like sweet food? (yes/no)");
            String sweet = scanner.nextLine();

            //display recipe names
            String recipe;
            if (vegetarian.equalsIgnoreCase("yes") && spicy.equalsIgnoreCase("yes")) {
                recipe = "Spicy veg recipe";
            } else if (vegetarian.equalsIgnoreCase("yes") && sweet.equalsIgnoreCase("yes")) {
                recipe = "Sweet veg recipe";
            } else if (vegetarian.equalsIgnoreCase("yes")) {
                recipe = "mild Vegetarian recipe";
            } else if (spicy.equalsIgnoreCase("yes")) {
                recipe = "Spicy none veg recipe";
            }  else if (sweet.equalsIgnoreCase("yes")) {
                recipe = "Sweet none veg recipe";
            } else {
                recipe = "none veg recipe";
            }

            //insert perfect recipe
            System.out.println("Your perfect recipe is: " + recipe);

            System.out.println("Would you like another recipe? (yes/no)");
            String anotherRecipe = scanner.nextLine();
            if (anotherRecipe.equalsIgnoreCase("no")) {
                repeatProgramme = false;
            }
        }

        //close programme message
        System.out.println("Thank you for using the Perfect Recipe Generator!");


    }
}

//remember ignore case when pulling the scanner answers
//error handling
// add emojis
// maybe change to only ask if they like sweet food if they say they don't like spicy