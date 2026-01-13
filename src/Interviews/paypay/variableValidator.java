package Interviews.paypay;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class variableValidator {
    public static boolean isValidVariableName(String[] words, String variableName) {
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word.toLowerCase());
        }

        // Split based on uppercase letters
        List<String> parts = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (char ch : variableName.toCharArray()) {
            if (Character.isUpperCase(ch) && current.length() > 0) {
                parts.add(current.toString().toLowerCase());
                current.setLength(0);
            }
            current.append(ch);
        }

        if (current.length() > 0) {
            parts.add(current.toString().toLowerCase());
        }

        // Validate each extracted word
        for (String part : parts) {
            if (!wordSet.contains(part)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = {"is", "valid", "right"};

        System.out.println(isValidVariableName(words, "isValid"));     // true
        System.out.println(isValidVariableName(words, "IsValid"));     // true
        System.out.println(isValidVariableName(words, "IsValidRight"));   // false
    }
}
