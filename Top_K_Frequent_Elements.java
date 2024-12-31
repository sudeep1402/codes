import java.util.*;
public class Top_K_Frequent_Elements {
    public static void main(String[] args) {
        int nums[]={1,1,1,2,2,3};
        int k=2;
        // ArrayList<Integer> list= new ArrayList<>();
        int[] res=new int[k];
        // int max = Collections.max(Arrays.asList(nums));
        // int n= Collections.max(Arrays.asList(nums));
        int n=Arrays.stream(nums).max().getAsInt();
        int[] arr=new int[n+1];
        
        for (int i = 0; i < nums.length; i++) {
                arr[nums[i]]++;            
        }
        for (int i = 1; i<arr.length; i++) {
            System.out.println(i+" "+arr[i]);
            // list.add(i);
            res[i]=i;

        }
        for (int i:res ) {
            System.out.println(i);
            
        }
        // System.out.println(list);
        
        
    }
}