import java.util.Arrays;
import java.util.Scanner;
public class tcs_nqt{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        sc.nextLine();
        if(n>1000){
            System.out.println("input too large");
        }
        String[] code = new String[n];
        int[] price = new int[n];
        System.out.println("enter the details");
        for (int i = 0; i < n; i++) {
            code[i] = sc.nextLine();
            price[i] = sc.nextInt();     
            sc.nextLine();
        }
        Arrays.sort(price);
        for(int i = 0; i < n; i++){
            System.out.println(price[i] +" ");
        }
    }
}