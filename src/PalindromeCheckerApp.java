import java.util.Scanner;
import java.util.Stack;

// PalindromeChecker class encapsulating palindrome logic
class PalindromeChecker {

    // Method to check if a string is a palindrome
    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare characters while popping
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("        Palindrome Checker App       ");
        System.out.println("=====================================");
        System.out.println("UC11: Object-Oriented Palindrome Service");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Call method
        boolean result = checker.checkPalindrome(word);

        if (result) {
            System.out.println("Result: The word is a palindrome.");
        } else {
            System.out.println("Result: The word is NOT a palindrome.");
        }

        scanner.close();
    }
}
