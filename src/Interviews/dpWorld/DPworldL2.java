package Interviews.dpWorld;

public class DPworldL2 {


    void subarray (int a[], int output){
        for(int i = 0; i<a.length;i++){
            int sum  = a[i];
            if (sum == output){
                System.out.println("out found at indexes : " + i);
            }
            else {
                for (int j = i+1;j<a.length;j++){
                    sum = sum+ a[j];
                    if (sum==output){
                        System.out.println("out found at indexes : " + i + " and " +j);
                    }
                }
            }

        }
    }

    public static void main(String[]args){
        DPworldL2 dp = new DPworldL2();
           int a [] = {12, 7, 3, 4, 5, 8, 4};
           int output = 12;
        dp.subarray(a,output);
    }
}
