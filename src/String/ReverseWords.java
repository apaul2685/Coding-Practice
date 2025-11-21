package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseWords {

    public static void main(String[]args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String : ");
//        String input = sc.nextLine().trim();
//        sc.close();
//
//        StringBuilder output = new StringBuilder();
//
//        for (int i = input.length()-1; i>=0; i--){
//            if (input.charAt(i) == ' '){
//                output.append(input.charAt(i));
//            }
//            else {
//                int start = i;
//                while (i>=0&&input.charAt(i) !=' '){
//                    i--;
//                }
//                output.append(input.substring(i+1, start+1));
//            }
//        }
//        System.out.println(output);
//    }


        String s[] = "i am a very nice person".split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans = ans+s[i]+" ";
        }
        System.out.println(ans);
    }

}







