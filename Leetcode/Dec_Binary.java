public class Dec_Binary {
    public static void dec_bin(int n) {
        int[] binary = new int[32];
        int i = 0;
        while (n > 0) {
            binary[i] = n % 2;  
            n = n / 2;           
            i++;                 
        }
        
        System.out.print("Binary of the given number (using function) = ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int x = 10;
        String binary = Integer.toBinaryString(x);
        dec_bin(10); 
        System.out.println("Decimal to Binary (inbuilt): " + binary);
    }
}
