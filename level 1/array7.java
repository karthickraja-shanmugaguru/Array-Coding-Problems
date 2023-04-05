// Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.

// Note: There may be more than one subarray with sum as the given sum, print first such subarray. 

// Examples: 

// Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
// Output: Sum found between indexes 2 and 4
// Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
public class array7 {
    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum=33;
        int currentcount=arr[0];
        for(int i=0;i<arr.length;i++){
            currentcount=arr[i];
            for(int j=i+1;j<arr.length;j++){
                currentcount+=arr[j];
                if(sum==currentcount){
                    System.out.println(i+" "+j);
                    break;
                }
            }
            
        }
    }
}
