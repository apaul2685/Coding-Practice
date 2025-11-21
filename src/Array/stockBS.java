package Array;

import java.util.Scanner;

public class stockBS {
    public static int maximumprofit(int a[]){
        int minvalue = a[0];
        int maxprofit = 0;
        for (int i = 1; i<a.length;i++){
            minvalue = Math.min(minvalue, a[i]);
            int profit = a[i]-minvalue;
            maxprofit = Math.max(maxprofit,profit);

        }
        return maxprofit;

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stock prices : ");
        int a[] = new int[8];
        for (int i = 0; i<8; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        int maxprofit = maximumprofit(a);
        System.out.println("maximum profit is : " + maxprofit);

    }
}
