package Interviews.paypay;

public class ColumnwiseStringConcat {
    public static void main (String[]args){
        String [] arr = {"Daisy","Rose","Poppy","Hyacinth"};

        StringBuilder result = new StringBuilder();

        int maxlen = 0;
        for (String s : arr){
            maxlen = Math.max(maxlen, s.length());
        }

        for(int i =0; i < maxlen; i++){
            for(String s: arr) {
                if (i < s.length()) {
                    result = result.append(s.charAt(i));
                }
            }
        }
        System.out.println(result.toString());
    }
}
