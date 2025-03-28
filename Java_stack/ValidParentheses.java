import java.util.Stack;
public class ValidParentheses {
    public boolean validParanthese (String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c=='(' ||c=='['||c=='{'){
                stack.push(c);
            }
            else if(c==')' ||c==']'||c=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if((c==')' && top!='(') || (c==']' && top!='[')||(c=='}' && top!='{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    
    }
    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        boolean result = obj.validParanthese("()[{}");
        //
        System.out.println(result);
    }
    
}