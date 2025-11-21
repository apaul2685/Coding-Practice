    package Array;

    import java.util.Scanner;

    public class rotateArray {

        public static int[] rArray(int[] a, int k){
            int n = a.length;
            k = k%n;
            if (k<0){
                k = k+n;
            }
            reverseArray(a,0,n-k-1);
            reverseArray(a,n-k,n-1);
            reverseArray(a,0,n-1);
            return a;
        }

        public static void reverseArray(int a[], int i, int j){

            while (i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }

        }

        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the elements of array : ");
            int a[] = new int[8];
            for (int i = 0; i<a.length;i++){
                a[i] = sc.nextInt();
            }
            System.out.print("Enter the rotation value : ");
            int k = sc.nextInt();

            sc.close();

            rArray(a,k);
            for (int i = 0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
