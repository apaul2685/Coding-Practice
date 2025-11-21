package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KadaneAlgorithm {
    public static int LargestSumSubarray(int[]a){
        int n = a.length;
        int maxsum = 0;
        int sum = 0;
        for (int i = 0;i<n;i++){

            sum = sum + a[i];

            if (sum>maxsum){
                maxsum = sum;

            }if (sum<0){
                sum = 0;
            }

        }
        return maxsum;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of array : ");
        int a [] = new int[8];
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        int maxsum = KadaneAlgorithm.LargestSumSubarray(a);
        System.out.println("largest sum contiguous subarray : " + maxsum);
    }
}
