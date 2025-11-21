package Array;

import java.util.Scanner;

public class rainwater {
    public static int blockofwater(int a[]){
        int n = a.length;

        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = a[0];
        for(int i = 1; i<n;i++){
            left[i] = Math.max(left[i-1],a[i]);
        }

        right[n-1] = a[n-1];
        for (int i = n-2; i>=0;i--){
            right[i] = Math.max(right[i+1], a[i]);
        }

        int ans = 0;
        for(int i = 0; i<n; i++){
            ans = ans+(Math.min(left[i],right[i])-a[i]);
        }
        return ans;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of array : ");
        int a[] = new int[8];
        for (int i = 0; i<8;i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        int ans  = rainwater.blockofwater(a);
        System.out.println("total water trapped : " + ans);


    }
}
