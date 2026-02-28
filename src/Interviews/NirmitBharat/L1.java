package Interviews.NirmitBharat;

import java.util.HashMap;
import java.util.Map;

public class L1 {

    public static void main(String[] args) {
        int [] arr = {1,2,4,4,2,3,1};

        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > 1){
                System.out.println("duplicate value found" + " "+ entry.getKey());
            }
        }
    }
}
