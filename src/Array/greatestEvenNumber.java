package Array;

import java.security.PublicKey;

public class greatestEvenNumber {

    public static void main (String[]args){
            int [] arr = {2,4,6,8,10,1000};
            Integer greatesteven = findgreatesteven(arr);
            if(greatesteven != null){
                System.out.println("Greatest even number : " +greatesteven );
            }else {
                System.out.println("there are no even number in the array");
            }
    }

    public static Integer findgreatesteven(int[]arr){

        Integer max = null;
        for(int num : arr){
            if (num%2==0){
                if (max == null || num > max){
                        max = num;
                }
            }
        }
        return max;
    }


}
