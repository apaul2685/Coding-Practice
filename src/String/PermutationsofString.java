package String;

public class PermutationsofString {
    // Function to print all permutations of a string
    private static void permute(String str, String perm) {
        if (str.isEmpty()) {
            System.out.println(perm);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permute(str.substring(0, i) + str.substring(i + 1), perm + str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, "");

    }
}


