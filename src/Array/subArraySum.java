package Array;

public class subArraySum {

     void subArray(int arr[], int n, int sum)
    {
        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];

            if (currentSum == sum) {
                System.out.println("Sum found at index "
                        + i);
                return;
            }
            else {
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[j];

                    if (currentSum == sum) {
                        System.out.println(
                                "Sum found between indexes " + i
                                        + " and " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found");
        return;
    }

    public static void main(String[] args)
    {
        subArraySum sa = new subArraySum();
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        sa.subArray(arr, n, sum);
    }
}
