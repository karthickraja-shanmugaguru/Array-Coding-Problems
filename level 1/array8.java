// Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given array. The functions should put all 0s first, then all 1s and all 2s in last.

// // This problem is also the same as the famous “Dutch National Flag problem”. The problem was proposed by Edsger Dijkstra. The problem is as follows:
// Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
// Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}

class array8 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n=arr.length;
        int i=0,j=n-1,m=0;
        while(m<=j){
            if(arr[m]==0){
                swap(arr,i,m);
                m++;
                i++;
            }
          else  if(arr[m]==1){
                m++;
            }
            else if(arr[m]==2){
                swap(arr,m,j);
                j--;
            }
        }
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
