






    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            // Application Header
            System.out.println("=====================================");
            System.out.println("        Palindrome Checker App       ");
            System.out.println("=====================================");
            System.out.println("UC2: Print a Hardcoded Palindrome Result");
            System.out.println();

            // Hardcoded String
            String word = "madam";

            // Reverse the string
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            // Check Palindrome using if-else
            if (word.equals(reversed)) {
                System.out.println("The word \"" + word + "\" is a Palindrome.");
            } else {
                System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
            }

            System.out.println("=====================================");
        }
    }






