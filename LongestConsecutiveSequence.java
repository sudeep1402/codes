    import java.util.*;
    public class LongestConsecutiveSequence {
        public static int[] longestConsecutive(int arr[]) {
            int n=arr.length;
            Arrays.sort(arr);
            int k=1,max=1;
            for (int i = 0; i<=n; i++) {
                if(arr[i]-arr[i+1]==1){
                    k++;
                }
                
            }
            System.out.println(""+k);
            
            return arr;
            
        }
        public static void main(String[] args) {
            int arr[]={100,4,200,1,3,2};
            int result[] = longestConsecutive(arr);
            System.out.println("longest sequence:"+Arrays.toString(result));
            
        }
    }