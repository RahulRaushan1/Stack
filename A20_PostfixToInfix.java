package A16_Stack;
import java.util.Stack;
public class A20_PostfixToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for(int i = 0;i< str.length();i++){

            char ch = str.charAt(i);
            int ascii = (int) ch;

            // check if this character is a number or not
            if (ascii >= 48 && ascii <= 57 ){
                val.push(ch + "");
            }
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                String t = "(" + v1 + op + v2 + ")";
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
