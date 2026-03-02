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
public class PalindromeCheckerApp  {

    public static void main(String[] args) {

        String input = "level";

        System.out.println("========================================");
        System.out.println("        PALINDROME CHECKER APP          ");
        System.out.println("========================================");
        System.out.println("Input: " + input);

        // Choose strategy dynamically
        PalindromeStrategy strategy;

        // Change this to new DequeStrategy() to switch algorithm
        strategy = new StackStrategy();
        // strategy = new DequeStrategy();

        boolean result = strategy.check(input);

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Program execution completed.");
    }
}

/*
 ==========================================================
 INTERFACE - PalindromeStrategy
 ==========================================================
*/

interface PalindromeStrategy {
    boolean check(String input);
}

/*
 ==========================================================
 CLASS - StackStrategy
 ==========================================================
*/

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare while popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

/*
 ==========================================================
 CLASS - DequeStrategy
 ==========================================================
*/

class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Deque<Character> deque = new java.util.LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}