import java.util.*;
public class SlidingWindowMaximum {
    public static List<Integer> slidingwindowmaximum(int arr[],int k) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i <= arr.length-k; i++) {
            int max=Integer.MIN_VALUE;
            for (int j = 0; j < k ; j++) {
                max=Math.max(max,arr[i+j]);
            }
            list.add(max);
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]={1,-1,};
        int k=1;
        List<Integer> result=slidingwindowmaximum(arr,k); 
        System.out.println(" "+result);
        
    }
}