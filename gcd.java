public class gcd {
    public static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int res=gcd(70,15);
        System.out.println("res:"+res);
    }
}

