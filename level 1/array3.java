// Given an array (or string), the task is to reverse the array/string.
// Examples : 
 

// Input  : arr[] = {1, 2, 3}
// Output : arr[] = {3, 2, 1}

// Input :  arr[] = {4, 5, 1, 2}
// Output : arr[] = {2, 1, 5, 4}

public class array3 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2};
        rev(arr, 0,arr.length-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void rev(int[] arr,int l,int r){
        while(l<r){
            int temp = arr[l];
            arr[l++]=arr[r];
            arr[r--]=temp;
        }
    }
}
