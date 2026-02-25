import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {


    public static void main(String[] args) {






                System.out.println("=====================================");
                System.out.println("        Palindrome Checker App      ");
                System.out.println("=====================================");
                System.out.println("UC5: Stack-Based Palindrome Checker");
                System.out.println();


                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a word: ");
                String input = scanner.nextLine();


                Stack<Character> stack =new Stack<>();


                for (int i = 0; i < input.length(); i++) {
                    stack.push(input.charAt(i));
                }


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

