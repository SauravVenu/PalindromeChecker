import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
public class PalindromeCheckerApp {


    public static void main(String[] args) {


                // Application Header
                System.out.println("=====================================");
                System.out.println("        Palindrome Checker App      ");
                System.out.println("=====================================");
                System.out.println("UC7: Deque-Based Optimized Palindrome Checker");
                System.out.println();

                // Take user input
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a word: ");
                String input = scanner.nextLine();

                // Create Deque
                Deque<Character> deque = new LinkedList<>();

                // Insert characters into deque
                for (int i = 0; i < input.length(); i++) {
                    deque.addLast(input.charAt(i));  // insert at rear
                }

                boolean isPalindrome = true;

                // Compare front and rear elements
                while (deque.size() > 1) {
                    char front = deque.removeFirst();  // remove from front
                    char rear = deque.removeLast();    // remove from rear

                    if (front != rear) {
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

