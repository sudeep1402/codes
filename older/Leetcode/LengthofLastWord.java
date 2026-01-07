public class LengthofLastWord {
    public static void lastword(String str) {
        // int lastwrd=0;
        String[] word= str.split(" ");
        int n=word.length;
        System.out.println(" "+word[n-1]);
        String last=word[n-1];
        System.out.println(""+last.length());
    
    }
    public static void main(String[] args) {
        String str="luffy is still joyboy";

        lastword(str);
        
    }
}