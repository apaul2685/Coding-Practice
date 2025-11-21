package Array;

import java.util.HashMap;
import java.util.Map;

public class PrefixSumHashMap {
    public static int longestSubarrayWithSumK(int[] arr, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == K) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - K)) {
                int prevIndex = map.get(sum - K);
                maxLen = Math.max(maxLen, i - prevIndex);
            }

            // Store the first occurrence of this prefix sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3,1,1};
        int K = 3;
        System.out.println("Longest subarray length: " + longestSubarrayWithSumK(arr, K)); // Output: 4
    }

}
