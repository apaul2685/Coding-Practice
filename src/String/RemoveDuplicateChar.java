package String;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateChar {

    public static void removedulicate(String input){
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i<input.length();i++){
            set.add(input.charAt(i));
        }   

        for (char c : set){
            System.out.print(c);
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string : ");
        String input = sc.nextLine().toLowerCase();
        sc.close();

        removedulicate(input);

    }
}
