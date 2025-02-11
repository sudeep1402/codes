public class gcd {
    public static int gcdd(int a,int b){
        if(b==0) return a;
        else return gcdd(b,a%b);
    }
    public static void main(String[] args) {
        int res=gcdd(70,15);
        System.out.println("res:"+res);
    }
}

