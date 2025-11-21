package Interviews.Infosys;

public class test1 {

        public static void main(String[] args) {
            String input = "Test the Product";
            String s[] = input.split(" ");
            String finaloutput = " ";

            for(int i = 0; i<s.length;i++){
                String  word = s[i];
                String output  = " ";

                for(int j = word.length()-1; j>=0; j--){
                    output = output+word.charAt(j);
                }

                finaloutput = finaloutput+output+" ";
            }

            System.out.println(finaloutput);

        }
    }


