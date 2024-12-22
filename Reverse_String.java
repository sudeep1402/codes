public class Reverse_String {
    public static String rev_str(String instr) {
        char[] charArray = instr.toCharArray();
        int n = charArray.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[n - i - 1];
            charArray[n - i - 1] = temp;
        }
        return new String(charArray);
    }
    public static void main(String[] args) {
        String instr="abcd";
        StringBuilder str=new StringBuilder(instr);
        System.out.println("inbuilt :"+str.reverse());
        System.out.println("manual :"+rev_str(instr));
    }
}