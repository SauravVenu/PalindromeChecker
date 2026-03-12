import java.util.Scanner;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// Strategy 1: Reverse String Method
class ReverseStringStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}

// Strategy 2: Two Pointer Method
class TwoPointerStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// Context Class
class PalindromeCheckerService {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.checkPalindrome(input);
    }
}

// Main Application
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("        Palindrome Checker App       ");
        System.out.println("=====================================");
        System.out.println("UC12: Strategy Pattern Implementation");
        System.out.println();

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println("Choose Algorithm:");
        System.out.println("1. Reverse String Method");
        System.out.println("2. Two Pointer Method");

        int choice = scanner.nextInt();

        PalindromeCheckerService service = new PalindromeCheckerService();

        if (choice == 1) {
            service.setStrategy(new ReverseStringStrategy());
        } else {
            service.setStrategy(new TwoPointerStrategy());
        }

        boolean result = service.executeStrategy(word);

        if (result) {
            System.out.println("Result: The word is a palindrome.");
        } else {
            System.out.println("Result: The word is NOT a palindrome.");
        }

        scanner.close();
    }
}