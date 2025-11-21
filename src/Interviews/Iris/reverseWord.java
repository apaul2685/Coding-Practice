package Interviews.Iris;

public class reverseWord {

    static String str = "My name is Anuj";
    static String newstr = "";

    public static void main (String[]args){

            String str1 [] = str.split(" ");
            for (int i = str1.length-1; i>=0;i--){
                newstr = newstr+ " " +str1[i];
            }
            System.out.println(newstr);

    }

}
