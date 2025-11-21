package Interviews.dpWorld;

import java.util.HashMap;

public class DPworldL2Hash {
    public void subarrayHash(int []a, int output){

        HashMap<Integer, Integer> map = new HashMap<>();
        int currsum = 0;

        for(int i=0;i<a.length;i++){
            currsum = currsum+a[i];
            if (currsum==output){
                System.out.println("index found at : "+ 0 + "and " + i);
            }
            if (map.containsKey(currsum-output)){
                System.out.println("index found at : "+ (map.get(currsum-output)+1) + " and "+ i);
            }

            map.put(currsum,i);
        }
    }

    public static void main(String[]args){
        int a[] = {7, 3, 4, 5, 8, 4};
        int output = 12;
        DPworldL2Hash dph = new DPworldL2Hash();
        dph.subarrayHash(a,output);
    }
}
