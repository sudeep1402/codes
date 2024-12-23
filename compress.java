public class compress {
    public static String compresss(String str) {
      
        StringBuilder new1=new StringBuilder("");
        int count;
        for (int i = 0; i <  str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                count=str.charAt(i)-'0';
                for (int j = 1; j <count; j++) {
                    new1.append(str.charAt(i-1));
                }
            }
            else{
                    new1.append(str.charAt(i));
                }           
        }
        return new1.toString();
    }
    public static void main(String[] args) {
        String str="a3b2c5";
        System.out.println("new string is:"+compresss(str));    
   }
}