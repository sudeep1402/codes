import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        // Create a map to store the value of each Roman numeral
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int result = 0;
        
        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            // Get the value of the current Roman numeral
            int currentVal = romanMap.get(s.charAt(i));
            
            // Check if we are at the last character or if the current character's value is greater than or equal to the next character's value
            if (i + 1 < s.length() && currentVal < romanMap.get(s.charAt(i + 1))) {
                // If current value is less, subtract it (e.g., IV, IX)
                result -= currentVal;
            } else {
                // Otherwise, add the value (e.g., VI, XI)
                result += currentVal;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger converter = new RomanToInteger();
        
        // Test examples
        System.out.println(converter.romanToInt("III"));   // Output: 3
        System.out.println(converter.romanToInt("LVIII")); // Output: 58
        System.out.println(converter.romanToInt("MCMXCIV"));// Output: 1994
    }
}
