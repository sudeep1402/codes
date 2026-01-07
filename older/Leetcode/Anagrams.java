import java.util.*;
public class Anagrams {
    public int isanagrams(String str1,String str2) {
        String s1=str1.toLowerCase();
        String s2=str2.toLowerCase();
        char char1[]=s1.toCharArray();
        char char2[]=s2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.equals(char1,char2)){
            return 1;
        }
        else return 0;
    }
    public static void main(String[] args) {
        String str1="CAR";
        String str2="Acr";
        Anagrams obj= new Anagrams();
        int result=obj.isanagrams(str1,str2);
        System.out.println("result:"+result);
      
    }
}