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

        boolean repeatProgramme = true;


        while (repeatProgramme) {
            String[] preferences = getUserPreferences(scanner);
            String recipe = generateRecipe(preferences);
            displayRecipe(recipe);
            repeatProgramme = askUserIfTheyWantToRepeat(scanner);
        }
        System.out.println("Thank you for using the Perfect Recipe Generator!");
        scanner.close();


    }
        //add getUserPreferences method here - move questions into this
        //Collect user input on their preferences
        public static String[] getUserPreferences(Scanner scanner){
            String[] userPreferences = new String[3];

            System.out.println("\nWould you like a vegetarian/vegan recipe? (yes/no)");
            userPreferences[0] = scanner.nextLine();

            System.out.println("Would you like it to be spicy? (yes/no)");
            userPreferences[1] = scanner.nextLine();

            System.out.println("Would you like it to be low calorie? (yes/no)");
            userPreferences[2] = scanner.nextLine();

            return userPreferences;
        }

        //add generateRecipe method to get the perfect recipe for the users answers
        //choose which recipe fits best
        public static String generateRecipe(String[] preferences) {
            String vegetarian = preferences[0];
            String spicy = preferences[1];
            String lowCal = preferences [2];
            String recipe;

            if (vegetarian.equalsIgnoreCase("yes") && spicy.equalsIgnoreCase("yes") && lowCal.equalsIgnoreCase("yes")) {
                recipe = "Spicy low cal veg recipe";
            } else if (vegetarian.equalsIgnoreCase("yes") && spicy.equalsIgnoreCase("yes")) {
                recipe = "spicy veg recipe";
            } else if (vegetarian.equalsIgnoreCase("yes") && lowCal.equalsIgnoreCase("yes")) {
                recipe = "low cal veg Vegetarian recipe";
            } else if (vegetarian.equalsIgnoreCase("yes")) {
                recipe = "mild none veg recipe";
            }  else if (spicy.equalsIgnoreCase("yes") && lowCal.equalsIgnoreCase("yes")) {
                recipe = "spicy low cal none veg recipe";
            } else if (spicy.equalsIgnoreCase("yes")) {
                recipe = "spicy none veg non recipe";
            } else if (lowCal.equalsIgnoreCase("yes")) {
                recipe = "low cal none veg non recipe";
            } else {
                recipe = "non veg, non low cal non spicy recipe";
            }

            return recipe;
        }

        //add displayRecipe method to show which recipe has been chosen
        //show the recipe of choice
        public static void displayRecipe(String recipe) {
            System.out.println("Your perfect recipe is: " + recipe);
        }

        //add askUserIfTheyWantToRepeat method
        //this will ask if the user wants another recipe
        public static boolean askUserIfTheyWantToRepeat(Scanner scanner){
            System.out.println("Would you like another recipe? (yes/no)");
            String anotherRecipe = scanner.nextLine();
            return !anotherRecipe.equalsIgnoreCase("no");
        }
}

//to do
//error handling
// add emojis