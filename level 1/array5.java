// Given an array and a number K where K is smaller than the size of the array. Find the K’th smallest element in the given array. Given that all array elements are distinct.

// Examples:  

// Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
// Output: 7

// Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
// Output: 10 


public class array5 {
    public static void main(String[] args) {
        int[] arr={7, 10, 4, 3, 20, 15};
        int k=3;
        sort(arr,arr.length-1);
        System.out.println(arr[k-1]);
    }
    public static void sort(int[] arr,int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
        }
    }
    }
}
