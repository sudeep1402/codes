import java.util.Scanner;
class prefix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] pre = new int[n+1];
        pre[0]=0;
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1]+arr[i-1];
        }
        System.out.println("preffix is :");
        for(int i=0;i<=n;i++){
            System.out.print(pre[i]+" ");
        }
    }
}