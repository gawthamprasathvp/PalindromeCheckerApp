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
import java.util.Stack;
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
        String input = "noon";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare original string with popped characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
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