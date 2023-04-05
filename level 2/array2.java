// Find the Missing Number
// Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.

// Note: There are no duplicates in the list.

// Examples: 

// Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
// Output: 5
// Explanation: The missing number between 1 to 8 is 5
public class array2 {
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 6, 3, 7, 8};
        int n=8;
        System.out.println(find(arr,n));
    }
    public static int find(int[] arr,int n){
        int sum=(n*(n+1))/2;
        for(int i=0;i<arr.length;i++)
            sum-=arr[i];
        return sum;
    }
}
