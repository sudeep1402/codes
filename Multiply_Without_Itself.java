import java.util.*;
public class Multiply_Without_Itself {
    public static int[] product_without_itself(int arr[]) {
        int n=arr.length;
        int[] arr1 = new int[n];
          for (int i = 0; i < n; i++) {
            arr1[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i!=j){
                    arr1[i]*=arr[j];
                }
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int[] result = product_without_itself(arr);
        System.out.println(Arrays.toString(result));
    }
}