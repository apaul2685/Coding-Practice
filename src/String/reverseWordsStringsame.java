package String;

public class reverseWordsStringsame {

    public static void main(String[]args){
        String input = "I am a very nice person";

        String s[] = input.split(" ");
        String output = "";

        for(int i = 0; i<s.length;i++){
            String Boutput = s[i];
            String reverseBoutput = "";

            for (int j = Boutput.length()-1;j>=0;j--){
                reverseBoutput = reverseBoutput+Boutput.charAt(j);
            }

            output = output+reverseBoutput+" ";
        }
        System.out.println(output);
    }


}
