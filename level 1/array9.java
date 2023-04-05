//Move all negative numbers to beginning and positive to end with constant extra space
// An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.

// Examples : 

// Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
// Output: -12 -13 -5 -7 -3 -6 11 6 5

public class array9 {
    public static void main(String[] args) {
        int[] arr={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n=arr.length;
        int i=0,j=0;
        while(j<n && i<n){
            if(arr[j]<0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
