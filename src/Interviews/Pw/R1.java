package Interviews.Pw;

public class R1 {


        public static void main(String[] args) {
            String input = "i like working at physics wallah";
            System.out.println("Input : " + input);
            System.out.println("Output: " + transform(input));
        }

        public static String transform(String sentence) {

            char [] chars = sentence.toCharArray();

            StringBuilder nonspaces = new StringBuilder();

            for (char c : chars){
                if (c != ' '){
                nonspaces.append(c);
                }
            }
            nonspaces.reverse();

            char [] result = new char[chars.length];

            int j = 0;

            for (int i = 0; i < chars.length; i++){
                if (chars[i] == ' '){
                    result [i] = ' ';
                }
                else {
                    result [i] = nonspaces.charAt(j++);
                }
            }

            return new String(result);
        }
    }


