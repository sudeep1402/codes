public class Validpalindrome {
    public static void isPalindrome(String s) {
        String[] str=s.replaceAll("[^a-z0-9]", "").split("\\s+");
        StringBuilder rev= new StringBuilder(" ");
        for(String a: str){
            System.out.print(a);
            
        }

    }
    public static void main(String[] args) {
        System.out.println();
        String s="A man, a plan, a canal: Panama";
        isPalindrome(s);

        
    }
}