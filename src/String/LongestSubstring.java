//longest substring without repeating characters

package String;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class LongestSubstring {
    public static int lengthofLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        int max = 0;

        while(end<s.length()){
            char c = s.charAt(end);
            while (set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            end++;
            max=Math.max(max, end-start);
        }
        return max;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine();
        sc.close();

        System.out.println("Longest string of non repeating characters are : " + lengthofLongestSubstring(s));
    }

}
