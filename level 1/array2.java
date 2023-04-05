//Find the minimum and maximum element in an array
// Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

// Example 1:

// Input:
// N = 6
// arr[] = {3, 2, 1, 56, 10000, 167}
// Output:
// min = 1, max =  10000
class array2{
    public static void main(String[] args) {
        int[] arr={3, 2, 1, 56, 10000, 167};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(max<i)
            max=i;
            if(min>i)
            min=i;
        }
        System.out.printf("min = %d, max = %d",min,max);
    }
}