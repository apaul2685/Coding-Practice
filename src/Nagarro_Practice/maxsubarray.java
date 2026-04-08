package Nagarro_Practice;

public class maxsubarray {
     public static int maxsubarraysum(int [] arr){
         int current_sum = arr[0];
         int max_sum = arr[0];

         for (int i = 0; i < arr.length; i++){
             current_sum = Math.max(arr[i],current_sum+arr[i]);
             max_sum = Math.max(current_sum, max_sum);
         }
         return max_sum;
     }

     public static void maxsubarrayIndices(int []arr){
         int currentsum = arr[0];
         int maxsum = arr[0];
         int start = 0; int end = 0; int tempsatrt = 0;

         for (int i = 0; i<arr.length; i++){
             if (arr[i]>currentsum+arr[i]){
                 currentsum = arr[i];
                 tempsatrt = i;
             }else{
                 currentsum = currentsum+arr[i];
             }
             if (currentsum>maxsum){
                 maxsum = currentsum;
                 start = tempsatrt;
                 end = i;
             }
         }

         System.out.print("sub array : ");
         for (int i = start; i<= end ; i++){
             System.out.print(arr[i] + " ");
         }

         System.out.println();


     }

     public static void main (String[]args){
         int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

         System.out.println("Array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]");
         System.out.println("Maximum Sum: " + maxsubarraysum(arr));
         maxsubarrayIndices(arr);
     }
}
