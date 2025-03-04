import java.util.*;

class MaximumOfSubarrayOfGivenSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the k value :");
        int k = sc.nextInt();
        
        for(int i = 0; i <= n - k; i++) { // Loop from i = 0 to i = n - k
            int currMax = arr[i];  // Start by setting currMax to the first element of the window
            
            // Loop through the next k elements to find the maximum in the current window
            for(int j = i + 1; j < i + k; j++) {
                currMax = Math.max(currMax, arr[j]); // Update currMax if we find a larger element
            }
            
            // Print the maximum element for the current window
            System.out.print(currMax + " ");
        }
        sc.close();
    }
}
