package Nagarro_Practice;

public class secondmin {
    public static int findSecondMinimum(int[] arr){

        if (arr == null || arr.length<2){
            throw new IllegalArgumentException ("Array must have atleast 2 values");
        }
        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;

        for(int num : arr){
            if (num < min){
                secondmin = min;
                min = num;
            } else if (num < secondmin && num != min) {
                secondmin = num;
            }
        }
        if (secondmin == Integer.MAX_VALUE){
            throw new RuntimeException("No Second minium found");
        }

        return secondmin;

    }

    public static void main (String[]args){
        int [] arr = {4, 5, 6, 2, 3, 5 ,6, 3, 4 ,9, 10};
        System.out.println(findSecondMinimum(arr));
    }
}
