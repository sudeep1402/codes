public class Sum_Of_Digit {
    public static int sumofdigits(int x) {
        int dig,rem=0;
        while(x>0){
            dig=x%10;
            rem=rem+dig;
            // for reverse of the given digits
            // rem=rem*10+rem;
            x=x/10;
        }
        return rem;
    }
    public static void main(String[] args) {
        System.out.println("sum of digits are:"+sumofdigits(123));
        
    }
}