import java.util.*;
public class watermelon {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter a number: ");  // Prompting user for input
        n = sc.nextInt();
        
        if (n % 2 == 0 && n > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
            
        }
    }
}
