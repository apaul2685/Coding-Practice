package String;

import java.util.HashMap;
import java.util.Map;

public class StringPalindrome {
    public static void main(String[] args) {
        String inputString = "aaab";
        boolean canBePalindrome = canFormPalindrome(inputString);

        if (canBePalindrome) {
            System.out.println("The string \"" + inputString + "\" can be rearranged to form a palindrome.");
        } else {
            System.out.println("The string \"" + inputString + "\" cannot be rearranged to form a palindrome.");
        }
    }

    public static boolean canFormPalindrome(String str) {
        // Create a map to count character frequencies
        Map<Character, Integer> map = new HashMap<>();

        // Count frequencies of each character
        for (char c : str.toCharArray()) {
           map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Check the number of characters with odd frequencies
        int oddCount = 0;
        for (int count : map.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // For odd length strings, there can be only one character with an odd frequency
        // For even length strings, there should be no characters with an odd frequency
        return oddCount <= 1;
    }
}
