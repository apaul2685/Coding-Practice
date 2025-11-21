package String;

import java.util.Scanner;

public class ReverseString {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = sc.nextLine().trim();
        sc.close();

        String nstr = "";
        char ch;

        for(int i = 0;i<input.length();i++){
            ch = input.charAt(i);
            nstr = ch+nstr;
        }

        System.out.println("Reversed word : "+ nstr);
    }
}
