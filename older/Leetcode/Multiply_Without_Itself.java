import java.util.*;
public class Multiply_Without_Itself {
// Brute force method
    // public static int[] product_without_itself(int arr[]) {
    //     int n=arr.length;
    //     int[] arr1 = new int[n];
    //       for (int i = 0; i < n; i++) {
    //         arr1[i] = 1;
    //     }
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if(i!=j){
    //                 arr1[i]*=arr[j];
    //             }
    //         }
    //     }
    //     return arr1;
    // }
        public static int[] product_without_itself(int arr[]) {
        int n=arr.length;        
        int[] left = new int[n];
        int[] right = new int[n];
        left[0]=1;
        right[n-1]=1;
        for (int i = 1; i < n; i++) {
            left[i]=left[i-1]*arr[i-1];
        }
        System.out.print("left array:");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+left[i]);            
        }

        for (int i = n-2; i >= 0; i--) {
            right[i]=right[i+1]*arr[i+1];            
        }System.out.println(" ");
        
        System.out.print("right array:");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+right[i]);            
        }
        int res[]=new int[n];
        for (int i = 0; i < n; i++) {
            res[i]=left[i]*right[i];
        }System.out.println( " ");
        
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int[] result = product_without_itself(arr);
        System.out.println(Arrays.toString(result));
    }
}