package Array;

public class LongestSubArraysumK {
    public static int longestsubArray(int[]arr, int k){
        int start = 0, end = 0, sum = 0, maxlen = 0;

        while(end<arr.length){
            sum = sum+arr[end];

            while (sum>k && start<=end){
                sum = sum - arr[start];
                start++;
            }

            if (sum==k){
                maxlen = Math.max(maxlen, end-start+1);
            }
            end++;
        }
        return maxlen;
    }

    public static void main(String[]args){
        int [] arr = {1,7,2,2,1,4,7};
        int k = 12;
        System.out.println(LongestSubArraysumK.longestsubArray(arr,k));

    }
}
