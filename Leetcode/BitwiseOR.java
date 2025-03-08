import java.util.HashSet;
import java.util.Set;

public class BitwiseOR {

    public static int countDistinctBitwiseOR(int[] arr) {
        // Set to store the distinct OR results
        Set<Integer> distinctOrResults = new HashSet<>();
        
        // Iterate through all possible subarrays
        for (int i = 0; i < arr.length; i++) {
            int currentOr = 0;
            for (int j = i; j < arr.length; j++) {
                currentOr |= arr[j];  // Perform bitwise OR for each element in the subarray
                distinctOrResults.add(currentOr);  // Add the OR result to the set
            }
        }
        
        // Return the number of distinct OR results
        return distinctOrResults.size();
    }

    public static void main(String[] args) {
        // Example usage with the array [1, 2, 4, 5]
        int[] arr = {1, 2, 4, 5};
        System.out.println(countDistinctBitwiseOR(arr));  // Output: 7
    }
}
