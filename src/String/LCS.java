package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LCS {

    public static int lengthofLCS(char[]str1, char[]str2, int p, int q){

        if (p==0 || q==0){
            return 0;
        }

        if (str1[p]==str2[q]){
            return 1+ lengthofLCS(str1,str2,p-1, q-1);
        }
        else {
            return Math.max(lengthofLCS(str1,str2,p-1,q),lengthofLCS(str1,str2,p,q-1));
        }
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String : ");
        String string1 = sc.nextLine();
        System.out.println("Enter the second String : ");
        String string2 = sc.nextLine();
        sc.close();

        char[] str1 = string1.toCharArray();
        char[] str2 = string2.toCharArray();
        int p = string1.length()-1;
        int q = string2.length()-1;

       int len =  LCS.lengthofLCS(str1,str2,p,q);
        System.out.println("Longest common subsequence is : " + len);
}}
