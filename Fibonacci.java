public class Fibonacci {
    public int fibonacci(int x) {
        if(x==0) return 0;
        if(x==1) return 1;
        else return fibonacci(x-1) +fibonacci(x-2);
    }
    public static void main(String[] args) {
        Fibonacci obj =new Fibonacci();
        int x=6;
        int res=obj.fibonacci(x);
        System.out.println(" fib of n'th number is:"+res);
        
    }
}