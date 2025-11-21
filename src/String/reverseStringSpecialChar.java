package String;

import java.util.Scanner;

public class reverseStringSpecialChar {

    public static char[] rssc(String strg){
        int i = 0;
        int j = strg.length()-1;

        char[] chararray = strg.toCharArray();

        while(i<j){
            if (!Character.isAlphabetic(chararray[i])){
                i++;
            } else if (!Character.isAlphabetic(chararray[j])) {
                j--;
            }else {
                char temp = chararray[i];
                chararray[i] = chararray[j];
                chararray[j] = temp;
                i++;
                j--;
            }
        }

        return chararray;


    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yout string : ");
        String inputstring = sc.nextLine();
        sc.close();

        char[] array = reverseStringSpecialChar.rssc(inputstring);
        String rev = new String(array);
        System.out.println("output string is : " + rev);
    }


}
