import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {

    public static int  longestSubsequence(String s) {
        HashSet<Character> se = new HashSet<>(); // Stores unique chars in current window
        int left = 0;                           // Left boundary of window
        int maxlen = 0;                         // Tracks maximum length found

        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);        // Current character

            // Remove characters from left until window is valid again
            while (se.contains(curr)) {
                se.remove(s.charAt(left));
                left++;
            }

            se.add(curr);                       // Add current char to set
            maxlen = Math.max(maxlen, right - left + 1); // Update max length
        }

        return maxlen;

    }

    public static void main(String[] args) {
        System.out.println(longestSubsequence("abcabcbb"));
        
    }
}
