import java.util.*;
public class satCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string = ");
        String str = sc.nextLine();
        int n = str.length();
        char[] chr = str.toCharArray();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println(chr[i]);
        }
        LinkedHashMap<Character,Integer> mo = new LinkedHashMap<>();
        for(int i=0;i<chr.length;i++){
            mo.put(chr[i],mo.getOrDefault(chr[i],0)+1);
        }
        System.out.println("character"+"frequency");
        for(Map.Entry<Character,Integer> entry : mo.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }        
    }
}

            // HashMap<Integer,Integer> mp = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        // }
        // System.out.println("Element - Frequency:");
        // for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
        //     System.out.println(entry.getKey() +" "+ entry.getValue());