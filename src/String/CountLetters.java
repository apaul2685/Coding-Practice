package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountLetters {

    static void countletter(String s){

        HashMap<Character,Integer> map = new HashMap<>();
        char[] strarray = s.toCharArray();

        for (char c : strarray){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }

        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.nextLine().toLowerCase();
        sc.close();

        CountLetters.countletter(input);
    }}
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (char c : input.toCharArray()){
//            if (Character.isLetter(c)){
//                int count = map.getOrDefault(c,0);
//                count++;
//                map.put(c, count);
//            }
//        }
//
//        System.out.println("The frequency of each letter is :" + map);

