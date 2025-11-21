package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class Uniquechar {
    public static Character uchar(String str){

        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[]args){
        String str = "anfgahsd";
        System.out.println(Uniquechar.uchar(str));
    }
}
