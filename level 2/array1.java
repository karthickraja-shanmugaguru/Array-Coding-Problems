// Program to cyclically rotate an array by one
// Given an array, cyclically rotate the array clockwise by one. 

// Examples:  

// Input:  arr[] = {1, 2, 3, 4, 5}
// Output: arr[] = {5, 1, 2, 3, 4}
public class array1 {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        int n= arr.length;
        rotate(arr,0,n-2);
        rotate(arr,0,n-1);
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
    public static void rotate(int[] arr,int l,int r){
        while(l<r){
            int temp =arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}
