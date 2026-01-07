import java.util.Scanner;
class primeNumberInRange{
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int  compute(int n){
        int count=0;
        int num=1;
        while(true){
            num++;
            if(isPrime(num)){
                count++;
            }
            if(count>=n)
                break;
        }
        return num;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int p1 = compute(n1);
        int p2 = compute(n2);
        int res = (p1*p2)-1;
        System.out.println("res :"+res);
    }
}