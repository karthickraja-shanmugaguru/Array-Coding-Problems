// Find duplicates in O(n) time and O(1) extra space | Set 1
// Given an array of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number of times. Find these repeating numbers in O(n) and using only constant memory space.

// Example: 

// Input : n = 7 and array[] = {1, 2, 3, 6, 3, 6, 1}
// Output: 1, 3, 6

// Explanation: The numbers 1 , 3 and 6 appears more
// than once in the array.
public class array4 {
      public static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            if (arr[index] < 0) {
                System.out.print(index + " ");
            } else {
                arr[index] = -arr[index];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 3, 6, 1};
        findDuplicates(arr);
    }
}
