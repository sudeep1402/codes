import java.util.*;
public class Top_K_Frequent_Elements {
    public static void main(String[] args) {
        int nums[]={1,1,1,2,4,4,4,4,2,3};
        int k=2;
        ArrayList<Integer> list= new ArrayList<>();
        
        // int max = Collections.max(Arrays.asList(nums));
        // int n= Collections.max(Arrays.asList(nums));
        int n=Arrays.stream(nums).max().getAsInt();
        int[] arr=new int[n+1];
        
        for (int i = 0; i < nums.length; i++) {
                arr[nums[i]]++;            
        }
        for (int i = 1; i<arr.length; i++) {
            System.out.println(i+" "+arr[i]);
            list.add(i);
        }
        System.out.println();
        
        for (int i = 0; i <k; i++) {
            System.out.print(list.get(i)+" ");
                        
        }
        // System.out.println(list);
        
        
    }
}