/**
 * ==========================================================
 * MAIN CLASS – UseCase1PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Developer
 * @version 1.0
 */

public class PalindromeCheckerApp {

    private static final String APP_NAME = "Palindrome Checker Management System";
    private static final String VERSION = "1.0";

    /**
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        displayWelcomeMessage();
        String input = "madam";

        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Display original and reversed strings
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }

    /**
     * Displays applicatio
     * n welcome message and version.
     */
    private static void displayWelcomeMessage() {
        System.out.println("===============================================");
        System.out.println(" Welcome to the " + APP_NAME);
        System.out.println(" Version: " + VERSION);
        System.out.println("===============================================");
        System.out.println("Application started successfully.");
    }

}