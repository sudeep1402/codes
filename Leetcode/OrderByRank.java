import java.util.*;
class OrderByRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp[]=arr.clone();
        Arrays.sort(temp);
        int rank=1;
        for(int i=0;i<n;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],rank);
                       //key and value
                rank++;
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        for(int i =0;i<n;i++){
            System.out.print( arr[i]+" ");
            //fetch the value depending upon the key
        }
        System.out.println();
        for(int i =0;i<n;i++){
            System.out.print( map.get(arr[i])+" ");
            //fetch the value depending upon the key
        }
// System.out.println(map.get(10));
    }
}