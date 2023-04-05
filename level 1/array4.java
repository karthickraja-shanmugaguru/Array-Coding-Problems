// Given an array arr[] of size N, the task is to sort this array in ascending order in C.
// Examples: 

// Input: arr[] = {0, 23, 14, 12, 9}
// Output: {0, 9, 12, 14, 23}

public class array4 {
    public static void main(String[] args) {
        int[] arr={0, 23, 14, 12, 9};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
