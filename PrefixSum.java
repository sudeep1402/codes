public class PrefixSum {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i]+" ");
            
            
        }
    }
}