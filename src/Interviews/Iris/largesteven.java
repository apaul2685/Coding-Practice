package Interviews.Iris;

public class largesteven {

    public static void main(String[] args) {
        int[] numbers = {3, 8, 2, 15, 24, 7, 18}; // Sample array

        Integer maxEven = null; // Use Integer to handle empty or no-even case

        for (int num : numbers) {
            if (num % 2 == 0) {
                if (maxEven == null || num > maxEven) {
                    maxEven = num;
                }
            }
        }

        if (maxEven != null) {
            System.out.println("Largest even number is: " + maxEven);
        } else {
            System.out.println("No even numbers in the array.");
        }
    }
}