package leetcode;

public class longestCommonSubsequence {
    public int longestCommonSubsequence (String text1, String text2){
        int m = text1.length();
        int n = text2.length();

        int [][] LCS = new int[m+1][n+1];

        for(int i =1; i<= m; i++){
            for (int j = 1; j <= n; j++){
                if (text1.charAt(i-1) == text2.charAt(j-1)){
                    LCS[i][j] = 1+ LCS[i-1][j-1];
                }else
                    LCS[i][j] = Math.max(LCS[i-1][j],LCS[i][j-1]);
            }
        }

        return LCS[m][n];

    }

    public static void main(String[]args){
        String text1 = "abcdef";
        String text2 = "aef";

        longestCommonSubsequence lcs = new longestCommonSubsequence();
        System.out.println(lcs.longestCommonSubsequence(text1,text2));
    }
}
