import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckerApp {


    public static void main(String[] args) {




                // Application Header
                System.out.println("=====================================");
                System.out.println("        Palindrome Checker App      ");
                System.out.println("=====================================");
                System.out.println("UC6: Queue + Stack Based Palindrome Check");
                System.out.println();

                // Take user input
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a word: ");
                String input = scanner.nextLine();

                // Create Stack and Queue
                Stack<Character> stack = new Stack<>();
                Queue<Character> queue = new LinkedList<>();

                // Insert characters into both structures
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    stack.push(ch);      // LIFO
                    queue.add(ch);       // FIFO (enqueue)
                }

                boolean isPalindrome = true;

                // Compare dequeue (queue) with pop (stack)
                while (!stack.isEmpty()) {
                    if (stack.pop() != queue.remove()) {  // dequeue
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

