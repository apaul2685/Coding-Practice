package leetcode;

public class ZigzagConversion {

    public static String convert (String s, int numrows){

        if (numrows == 1 || numrows >= s.length()-1){
                return s;
        }

        StringBuilder [] rows = new StringBuilder[numrows];

        for (int i = 0; i<numrows; i++){
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingdown = false;

        for(char c : s.toCharArray()){
            rows[currentRow].append(c);

            if(currentRow == 0 || currentRow == numrows-1){
                goingdown = !goingdown;
            }

            currentRow += goingdown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder row: rows){
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[]args){
        String str = "PAYPALISHIRING";
        int numrows = 3;

        System.out.println(convert(str, numrows));

    }
}
