public class MaximumSubarray {
    public static void Method2(int[] nums) {
        int max = Integer.MIN_VALUE; 
        int currentSum = 0; 

        for (int num : nums) {
            currentSum += num;
            max = Math.max(max, currentSum); 
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println(max);
    }
    public static void Method1(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n =nums.length;
    
        for (int i = 0; i < n; i++) {
            int currentsum=0;
            for (int j = i; j < n; j++) {
                currentsum=currentsum+nums[j];
                max=Math.max(max, currentsum);
            }                        
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Method1(nums);
        Method2(nums);
        
    }  
}