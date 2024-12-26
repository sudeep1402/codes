import java.util.*;
public class PasswordCreation {
    public static String password(String a, String b) {

        int n3=a.length()+b.length();        
        char res[]=new char[n3];
        char a1[]=a.toCharArray();
        char b1[]=b.toCharArray();
        int index=0;
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            res[index++] = a1[i];
            res[index++] = b1[i];
            }
        if (a.length() > b.length()) {
            for (int i = b.length(); i < a.length(); i++) {
                res[index++] = a1[i];
            }
        } 
        else {
            for (int i = a.length(); i < b.length(); i++) {
                res[index++] = b1[i];
            }
        }
            return Arrays.toString(res);
        }

        
    
    public static void main(String[] args) {
        String a="hackerrank";
        String b="mountain";
        String result=password(a,b);
        System.out.println(" "+result);
         

    }
}