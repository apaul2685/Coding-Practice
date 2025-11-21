package String;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram {
    public static boolean isanagram(String s, String t){

       if(s.length()!=t.length()) {
           return false;
       }

       int [] freq = new int[26];

       for (int i = 0; i< s.length(); i++){
           freq [s.charAt(i) - 'a']++;
           freq [t.charAt(i) - 'a']--;
       }

        for(int count : freq){
            if (count !=0 ) {
                return false;
            }
        }
        return true;
    }

    public static boolean isanagramm(String s, String t){
        if(s.length()!=t.length()) {
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c : t.toCharArray()){
            if (!map.containsKey(c)) return false;
            map.put(c,map.get(c)-1);
            if (map.get(c)<0) return false;
        }
        return true;
    }

    public static void main(String[]args){
        String s = "anuj";
        String t = "junas";

        System.out.println(StringAnagram.isanagramm(s,t));
        System.out.println(StringAnagram.isanagram(s,t));

    }

}
