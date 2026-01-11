package Interviews.dpWorld;

public class dpworldL1 {



    public void power(int a,int b){
        int c = 1;
        for(int i = b; i>=1; i--){
           c = c*a;
        }
        System.out.println(c);

    }

    public static void main(String[]args){
        dpworldL1 dp = new dpworldL1();
        dp.power(3, 2);

    }
}
