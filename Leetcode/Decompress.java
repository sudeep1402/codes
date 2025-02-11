public class Decompress {
    public static String compress (String str) {
        int count=1;
        StringBuilder new1= new StringBuilder("");
        new1.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }else{
                if(count>1){
                    new1.append(count);
                }
                new1.append(str.charAt(i));
                count=1;
            }
        }
        if(count>1) new1.append(count);
        return new1.toString();
    }
    public static void main(String[] args) {
        String str="aabbbcccc";
        System.out.println("decompressed string is:"+compress(str));
        
    }
}