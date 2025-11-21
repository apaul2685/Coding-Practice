package Interviews.MMT;

public class MMTL1 {

    public static void main (String[]args){
        int array [] = {-7, 2, -5, -8, 1, -5, 8};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i<array.length-2; i++){

            for(int j = i+1; j<array.length-1;j++){

                for (int k =j+1;k<array.length;k++) {
                    max = Math.max(max,array[i]*array[j]*array[k]);

                }
            }

        }

        System.out.println(max);

    }
}
