import java.util.*;
public class LongestConsecutiveSequence {
    public static int[] longestConsecutive(int arr[]) { 
        //List<int[]> res= new ArrayList<>();
        Arrays.sort(arr);
        int k=1,maxx=1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { // Ignore duplicates
                if (arr[i] == arr[i - 1] + 1) { // If consecutive
                    k++;
                } else { // Sequence breaks
                    maxx = Math.max(maxx, k); // Update max


                    System.out.println( " sudeep");
                    
                    k = 1;
                }
            }       
        }
        maxx=Math.max(maxx, k);
        System.out.println(""+maxx);      
        return arr;
    }
    public static void main(String[] args) {
    int arr[]={9,1,4,7,3,-1,0,5,8,-1,6};
    int result[] = longestConsecutive(arr);
    System.out.println("longest sequence:"+Arrays.toString(result));
        
    }
}