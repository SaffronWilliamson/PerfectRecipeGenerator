public class RecipeApp {
    public static void main(String[] args) {
        //add greeting page
        boolean start = GreetingPage.showGreetingPage();

        if (start) {
            System.out.println("continue programme");
        } else {
            System.out.println("end programme");
        }
    }
}
