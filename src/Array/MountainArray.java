package Array;

public class MountainArray {

    public static boolean mountainarray(int[]arr){

        int n = arr.length;
        if(n<3) return false;
        int i = 0;

        // walk up
        while (i+1<n && arr[i]<arr[i+1]){
            i++;
        }

        if(i == 0 || i == n-1) return false;

        // walk down

        while (i+1<n && arr[i]>arr[i+1]){
            i++;
        }
        return i == n-1;

    }

    public static void main (String[]args){

        int [] arr = {1,2,3,4,2,1};
        System.out.println(mountainarray(arr));
    }
}

