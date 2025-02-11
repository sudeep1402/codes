public class FormattinglargeProducts {
    public static String formatProducts (int a, int b){
        int res=1;
        int power=0;
        for (int i = a; i <= b; i++) {
            res=res*i;
        }
        while(res%10==0){
            power++;
            res=res/10;
        }
        return res+"*10^"+power;
        
    }
    public static void main(String[] args) {
        String result= formatProducts(3,10);
        System.out.println(" res:"+result);
        
    }
}