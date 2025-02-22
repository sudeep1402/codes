import java.util.ArrayList;
import java.util.List;

class KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandy = 0;

        // Find the maximum candy count among all kids
        for (int candy : candies) {
            maxCandy = Math.max(maxCandy, candy);
        }

        // Check if each kid can have the most candies
        for (int candy : candies) { 
            result.add(candy + extraCandies >= maxCandy); // Add true or false based on condition
        }

        return result;        
    }

    public static void main(String[] args) {
        KidsWiththeGreatestNumberofCandies solution = new KidsWiththeGreatestNumberofCandies();

        // Example test case
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result); // Output: [true, true, true, false, true]
    }
}
