import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask the user for their course
        System.out.print("Enter your course: ");
        String course = scanner.nextLine();

        // Ask the user for their birthday
        System.out.print("Enter your birthday (e.g., December 25, 2025): ");
        String birthday = scanner.nextLine();

        // Display formatted welcome message
        System.out.println("\nWelcome " + name);
        System.out.println("Welcome to " + course);
        System.out.println("We will be recording you as our birth month celebrant. Your birthday is " + birthday);
        System.out.println("Thank you for registering your personal information! Have a nice day!");

        // Close the scanner
        scanner.close();
    }
}
