package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class InversionPairs {
    public static List<List<Integer>> getInversionPairs(int[] arr) {
        int n = arr.length;
        List<List<Integer>> pairs = new ArrayList<>();

        // Check all pairs (i, j) where i < j
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    // Add pair [arr[i], arr[j]] to the list
                    List<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    pairs.add(pair);
                }
            }
        }
        return pairs;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        List<List<Integer>> inversionPairs = getInversionPairs(arr);

        System.out.println("Inversion pairs: " + inversionPairs);
        System.out.println("Total Inversion Count: " + inversionPairs.size());
    }

}
