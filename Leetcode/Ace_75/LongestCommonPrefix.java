import java.util.Arrays;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // Check if the input array is empty
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        Arrays.sort(strs); // O(N log N) for sorting the array of strings

        StringBuilder ans = new StringBuilder(); // Efficient string concatenation
        
        String first = strs[0];  // First string after sorting
        String last = strs[strs.length - 1]; // Last string after sorting
        
        // Iterate through characters of the first and last string to find the common prefix
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                ans.append(first.charAt(i)); // O(1) append operation
            } else {
                break; // Stop at the first mismatch
            }
        }
        return ans.toString(); // Convert StringBuilder to String and return the result
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        
        // Test examples
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(solution.longestCommonPrefix(strs1)); 
        
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(solution.longestCommonPrefix(strs2)); 
        
        String[] strs3 = {"cir", "car"};
        System.out.println(solution.longestCommonPrefix(strs3)); 
    }
}
