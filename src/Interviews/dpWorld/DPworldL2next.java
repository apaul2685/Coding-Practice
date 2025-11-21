package Interviews.dpWorld;

public class DPworldL2next {

        void subarray (int a[], int output){
            int start = 0, end = 0;
            int curr_sum = 0;

            while (end <= a.length) {
                if (curr_sum < output) {
                    if (end < a.length) {
                        curr_sum += a[end];
                    }
                    end++;
                } else if (curr_sum > output) {
                    curr_sum -= a[start];
                    start++;
                } else {
                    System.out.println("Output found at indexes : " + start + " to " + (end - 1));
                    curr_sum -= a[start];
                    start++;
                }
            }
        }

        public static void main(String[]args){
            DPworldL2next dp = new DPworldL2next();
            int a [] = {7, 3, 4, 5, 8, 4};
            int output = 12;
            dp.subarray(a,output);
        }
    }


