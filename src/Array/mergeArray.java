package Array;


import java.util.Arrays;

public class mergeArray {
    public static int[] merge(int[] arr1, int [] arr2) {
        int i =0,  j = 0,  k = 0;
        int [] result = new int[arr1.length+arr2.length];

        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]){
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }

        while (i<arr1.length) result[k++] = arr1[i++];
        while (j<arr2.length) result[k++] = arr1[j++];

        return result;
    }

    public static void main(String[]args){
        int[]arr1 = {1,2,3,4,5,6,10};
        int[]arr2 = {5,6,7};
        System.out.println(Arrays.toString(mergeArray.merge(arr1,arr2)));
    }

}