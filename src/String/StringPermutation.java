package String;

public class StringPermutation {
    public static void permute(String str, String remaining){
        if(str.length()==0){
            System.out.println(remaining);
            return;
        }

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            String ros = str.substring(0,i) + str.substring(i+1);
            permute(ros,remaining+ch);
        }
    }

    public static void main (String[]args){
        String str = "ABC";
        permute(str,"");
    }
}
