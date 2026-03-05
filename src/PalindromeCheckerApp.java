import java.util.Scanner;
public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Check if characters are equal
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("        Palindrome Checker App       ");
        System.out.println("=====================================");
        System.out.println("UC9: Recursive Palindrome Checker");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }

        scanner.close();

    }
}

