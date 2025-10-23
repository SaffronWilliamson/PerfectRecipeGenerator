import java.util.Scanner;

public class GreetingPage {
    public static boolean showGreetingPage() {
        //import scanner
        Scanner scanner = new Scanner(System.in);
        //welcome message
        System.out.println("Welcome to the Perfect Recipe Generator! \uD83C\uDF54 ");
        //first name
        System.out.print("Before we start, please enter your first name: ");
        String firstName = scanner.nextLine();
        //ask user if they want to continue with the programme
        System.out.println("Thank you " + firstName + ", are you ready to find your perfect recipe?");
        System.out.print("Please enter yes or no: ");
        //provide a message if they want to continue or close the programme if they don't

        while (true) {
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Great! Let's get started...");
                return true;
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Okay, maybe next time. Goodbye!");
                return false;
            } else {
                System.out.println("Invalid input. Please enter yes or no.");
            }
        }
    }
}
