package leetcode;

import java.util.HashMap;

public class twoSumHash {

    public int [] twoSum (int arr[], int target){

        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length;i++){
            int complement = target - arr[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i};

            }else {
                map.put(arr[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main (String[]args){

        int arr [] = {2,4,6,7,8};
        int target = 10;
        twoSumHash anuj = new twoSumHash();
        int [] result = anuj.twoSum(arr, target);
        System.out.println(result[0]+" "+result[1]);
    }

}
