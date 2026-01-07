class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        
        for (int i = 0; i < length; i++) {
            // Check if the current spot is empty and its neighbors (if they exist) are also empty
            if (flowerbed[i] == 0 
                && (i == 0 || flowerbed[i - 1] == 0)  // Check left
                && (i == length - 1 || flowerbed[i + 1] == 0)) {  // Check right
                
                flowerbed[i] = 1; // Plant a flower
                n--; // Reduce the required count
                
                if (n == 0) return true; // If all flowers are planted, return true
            }
        }
        
        return n <= 0; // If we planted enough flowers, return true; otherwise, false
    }

    public static void main(String[] args) {
        CanPlaceFlowers solution = new CanPlaceFlowers();

        // Test cases
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println(solution.canPlaceFlowers(flowerbed1, n1)); // Output: true

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println(solution.canPlaceFlowers(flowerbed2, n2)); // Output: false
    }
}
