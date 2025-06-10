import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dummyFile{
    public static HashMap<Character, Integer> countOccurrences(String input){
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char ch : input.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch, 0)+1);
        }
        return map1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string1 :");
        String str1 = sc.next();
         HashMap<Character, Integer> result = countOccurrences(str1);
        for(Map.Entry<Character,Integer> entry : result.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
    }
}