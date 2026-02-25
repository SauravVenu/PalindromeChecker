import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {


    public static void main(String[] args) {





                // Application Header
                System.out.println("=====================================");
                System.out.println("        Palindrome Checker App      ");
                System.out.println("=====================================");
                System.out.println("UC5: Stack-Based Palindrome Checker");
                System.out.println();

                // Take user input
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a word: ");
                String input = scanner.nextLine();

                // Create a Stack
                Stack<Character> stack = new Stack<>();

                // Push all characters into stack
                for (int i = 0; i < input.length(); i++) {
                    stack.push(input.charAt(i));
                }

                // Compare by popping from stack
                boolean isPalindrome = true;

                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Display result
                if (isPalindrome) {
                    System.out.println("Result: The entered word is a Palindrome.");
                } else {
                    System.out.println("Result: The entered word is NOT a Palindrome.");
                }

                scanner.close();


    }
}

