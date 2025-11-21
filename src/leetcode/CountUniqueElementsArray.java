package leetcode;

public class CountUniqueElementsArray {


    public static int removeduplicates(int[] nums){
        if(nums.length ==0) return 0;
        int i = 0;

        for (int j = 1; j< nums.length; j++ ){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        int k = i+1;
        System.out.println(k);
        return i+1;

    }

    public static void main(String[]args){
        int [] nums = {0,0,1,1,1,2,2,3,3,4};

        CountUniqueElementsArray.removeduplicates(nums);

    }

}
