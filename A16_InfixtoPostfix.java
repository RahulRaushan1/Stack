package A16_Stack;

import java.util.Stack;

public class A16_InfixtoPostfix {
    public static void main(String[] args) {
        String str = "8-(5+3)*(4/6)";
        System.out.println(str);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0;i<str.length();i++){

            char ch = str.charAt(i);
            int ascii = (int) ch;

            if(ascii>=48 && ascii <= 57) // character is a number
            {
                String s = "" + ch;
                val.push(s);
            }
            else if (op.size() ==0 || ch == '(' || op.peek() == '(')
                op.push(ch);
            else if (ch==')'){
                while(op.peek() != '('){
                    // do the operation
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t =  v1 + v2 + o;
                    val.push(t);
                }
                op.pop(); // remove the opening bracket
            }
            else{
                if(ch == '+' || ch =='-'){
                    // do the operation alwaus
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = v1 + v2 +o;
                    val.push(t);
                    op.push(ch);
                }
                else if (ch=='*' || ch== '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t =  v1 + v2 +o;
                        val.push(t);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t =  v1 + v2 + o;
            val.push(t);
        }
        System.out.println(val.peek());
    }
}
