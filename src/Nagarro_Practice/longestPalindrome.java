package Nagarro_Practice;

public class longestPalindrome {
    public static String findlongestpalindrome(String s){
        if(s==null || s.length()<1) return "";

        int start = 0, maxlen = 1;

        for(int i =0; i<s.length();i++){
            int len1 = expandAroundcenter(s,i,i);
            int len2 = expandAroundcenter(s, i, i+1);

            int len = Math.max(len1, len2);

            if(len>maxlen){
                maxlen = len;
                start = i-(len-1)/2;
            }
        }
        return s.substring(start,start+maxlen);
    }

    public static int expandAroundcenter(String s, int left, int right){
        while (left>=0 && right<s.length()&& s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String[]args){
        String s = "abfgerccdedccfgfer";
        String result = findlongestpalindrome(s);
        System.out.println(result);
    }
}
