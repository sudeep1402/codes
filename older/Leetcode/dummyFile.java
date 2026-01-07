public class dummyFile {  // Class names should start with uppercase and no parentheses
    public static int mergeArrays(int[] nums, int[] nums2) {  // Added 'static'
        int m = nums.length;
        int n = nums2.length;
        int[] merged = new int[m + n];

        // Copy nums into merged (first m elements)
        for (int i = 0; i < m; i++) {
            merged[i] = nums[i];
        }

        // Copy nums2 into merged (next n elements)
        for (int i = 0; i < n; i++) {
            merged[m + i] = nums2[i];
        }
        int mer=merged.length;
        if(mer%2!=0){
            return (mer/2);
        }
        else{
            return ((mer/2))-1 + ((mer/2)+1);
        }
        
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        int merged = mergeArrays(nums, nums2);
        System.err.println(merged);
        // Print the merged array to verify
    }
}