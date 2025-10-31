import java.util.Arrays;

public class Recipe {
    //store recipe info

    //info for each recipe - attributes
    String recipeName;
    String[] ingredients;
    boolean isVegetarian;
    boolean isSpicy;
    boolean isLowCalorie;

    public Recipe(String recipeName, String[] ingredients, boolean isVegetarian, boolean isSpicy, boolean isLowCalore) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.isVegetarian = isVegetarian;
        this.isSpicy = isSpicy;
        this.isLowCalorie = isLowCalore;
    }

    //display recipe details - method
    public void displayRecipe() {
        System.out.println("Your perfect recipe is: " + recipeName);
        System.out.println("Ingredients: " + Arrays.toString(ingredients));
        for (String ingredient : ingredients) {
            System.out.println("•" + ingredient);
        }
    }
}
