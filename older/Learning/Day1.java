import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            System.out.println(n);
        }else{
            System.out.println(n-(2*n));
        }
        
    }
    }