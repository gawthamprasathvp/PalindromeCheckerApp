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
import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp   {

    /**
     * Application entry point for UC13.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "Level";

        System.out.println("========================================");
        System.out.println("        PALINDROME PERFORMANCE TEST     ");
        System.out.println("========================================");

        // Start timing
        long startTime = System.nanoTime();

        boolean result = checkPalindrome(input);

        // End timing
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");

        System.out.println("Program execution completed.");
    }

    /**
     * Simple two-pointer palindrome check
     */
    private static boolean checkPalindrome(String input) {

        String normalized = input.toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}