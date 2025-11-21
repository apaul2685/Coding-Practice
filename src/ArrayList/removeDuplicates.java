package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicates {

        public static void main(String[] args) {
            // Creating an ArrayList with duplicate elements
            ArrayList<Integer> myList = new ArrayList<>();
            myList.add(1);
            myList.add(2);
            myList.add(3);
            myList.add(2);
            myList.add(1);

            System.out.println("Original List: " + myList);

            // Removing duplicates using a for loop
            ArrayList<Integer> uniqueList = removeDuplicates(myList);

            System.out.println("List after removing duplicates: " + uniqueList);
        }

        // Method to remove duplicates from an ArrayList using a for loop
        public static ArrayList<Integer> removeDuplicates1(ArrayList<Integer> list) {

            ArrayList<Integer> uniqueList = new ArrayList<>();
            for (Integer element : list) {
                if (!uniqueList.contains(element)) {
                    uniqueList.add(element);
                }
            }
            return uniqueList;
        }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
    }


