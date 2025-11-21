package String;

public class Palindrome {

        public static void main(String[] args) {
            String inputString = "madam"; // Change this to test with different strings
            boolean isPalindrome = checkPalindrome(inputString);

            if (isPalindrome) {
                System.out.println("The string \"" + inputString + "\" is a palindrome.");
            } else {
                System.out.println("The string \"" + inputString + "\" is not a palindrome.");
            }
        }

        public static boolean checkPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }

}
