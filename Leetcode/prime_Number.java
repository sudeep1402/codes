public class prime_Number {
    public static int isPrime (int x) {
        for (int i =2; i <= x/2; i++) {
            if(x%i==0){
                return -1;
            }   
        }
    return 1;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(10));
        
    }
}