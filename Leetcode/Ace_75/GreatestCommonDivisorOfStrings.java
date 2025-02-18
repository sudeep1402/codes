public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }
        
        int gcdLen = gcd(str1.length(), str2.length());
        
        return str1.substring(0, gcdLen);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        GreatestCommonDivisorOfStrings solution = new GreatestCommonDivisorOfStrings();
        
        System.out.println(solution.gcdOfStrings("ABCABC", "ABC")); // Output: "ABC"
        System.out.println(solution.gcdOfStrings("ABABAB", "ABAB")); // Output: "AB"
        System.out.println(solution.gcdOfStrings("LEET", "CODE"));  // Output: ""
    }
}
