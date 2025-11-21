package leetcode;

public class twosum {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Sum found between indexes " + i + " and " + j);
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args){
        int nums []= {1, 2, 3, 4 ,5 ,6, 7};
        twosum result = new twosum();
        result.twoSum(nums,11);
    }
}
