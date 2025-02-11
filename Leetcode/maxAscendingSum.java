class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int currentSum = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];  // Add to current ascending sum
            } else {
                max = Math.max(max, currentSum);  // Update max if needed
                currentSum = nums[i];  // Reset for a new ascending subsequence
            }
        }
        max = Math.max(max, currentSum);  // Handle last subsequence
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Hardcoded input array
        int[] nums = {10, 20, 30, 5, 10, 50};

        int result = solution.maxAscendingSum(nums);
        System.out.println("Max Ascending Sum: " + result);
    }
}
