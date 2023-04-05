// Count pairs with given sum
// Given an array of N integers, and a number sum, the task is to find the number of pairs of integers in the array whose sum is equal to sum.

// Examples:  

// Input:  arr[] = {1, 5, 7, -1}, sum = 6
// Output:  2
// Explanation: Pairs with sum 6 are (1, 5) and (7, -1).
public class array3 {
    public static void main(String[] args) {
        int[] arr={1, 5, 7, -1, 5};
        int n=arr.length;
        int sum=6;
        System.out.println(sum(arr,n,sum));
    }
    public static int sum(int[] arr,int n,int sum){
        int count=0;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-1;j++){
                if(arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        return count;
    }
}
