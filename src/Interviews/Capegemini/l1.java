package Interviews.Capegemini;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class l1 {


        public static void main(String[] args) {
            String str = "aaaaanujpal";
            char [] ch = str.toLowerCase().toCharArray();
            LinkedHashMap <Character, Integer> map = new LinkedHashMap<>();

            for (char c : ch){
                if(map.containsKey(c)){
                    map.put(c, map.get(c)+1);
                }else{
                    map.put(c, 1);

                }
            }

            for (Map.Entry entry : map.entrySet()){
                System.out.println(entry.getKey()+ " "+ entry.getValue());
            }
        }
    }
