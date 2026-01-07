public class Fibonacci {
    
    public int fibonacci1(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        else return fibonacci1(x - 1) + fibonacci1(x - 2);
    }

    public int fibonacci2(int x) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= x; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return x == 0 ? a : c;
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        int x = 6;
        int res1 = obj.fibonacci1(x);
        int res2 = obj.fibonacci2(x);
        System.out.println("Fibonacci (recursive) of " + x + " is: " + res1);
        System.out.println("Fibonacci (iterative) of " + x + " is: " + res2);
    }
}
