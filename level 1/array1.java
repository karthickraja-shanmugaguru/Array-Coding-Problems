// Find a peak element which is not smaller than its neighbours
// Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 

// Note: For corner elements, we need to consider only one neighbor. 

// Example:

// Input: array[]= {5, 10, 20, 15}
// Output: 20
// Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

public class array1{
    public static int peakElement(int[] arr,int n){
        if(n<=1)
        return -1;
        if(arr[0]>arr[1])
        return 0;
        if(arr[n-1]>arr[n-2])
        return n-1;
        for(int i=1;i<n-2;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }
        return -1;


    }
    public static void main(String[] args) {
       int arr[] = {10, 20, 15, 2, 23, 90, 67};
       int n=arr.length;
        System.out.println(peakElement(arr, n));

    }
}
