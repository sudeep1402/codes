import java.util.LinkedList;
import java.util.Arrays;
public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String str="a good   example";
        String[] word=str.split("\\s+");
        
        int n =word.length;
        System.out.println(n);
        
        StringBuilder rev=new StringBuilder(" ");
        for(int i=n-1;i>=0;i--){
            rev.append(word[i]).append(" ");        
        }
       String revstr=rev.toString().trim();
       System.out.println(revstr);
       
        
    }
}