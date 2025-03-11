import java.util.*;

class CountOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number of elements in the array
        int n;
        System.out.println("Enter the number of elements in the array:");
        n = sc.nextInt();
        sc.nextLine();  // Consume the newline after nextInt
        
        // Check if n is a valid number (should be greater than 0)
        if (n <= 0) {
            System.out.println("The number of elements should be greater than 0.");
            return;
        }
        
        // Initialize the array to store input elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        
        // Input the elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create a HashMap to count occurrences of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Print the occurrences of each element in the array
        System.out.println("Element - Frequency:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        sc.close();
    }
}
