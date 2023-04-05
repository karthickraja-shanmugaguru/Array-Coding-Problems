// Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. Expected time complexity is O(Logn) 

// Examples: 
//   Input: arr[] = {1, 1, 2, 2, 2, 2, 3}   x = 2
//   Output: 4 
public class array6 {
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 2, 2, 2, 3};
        int x=2,count=0;
        for(int i:arr){
            if(x==i)
            count++;
        }
        System.out.println(count);
    }
}
