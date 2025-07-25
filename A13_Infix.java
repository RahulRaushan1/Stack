package A16_Stack;
import java.util.Stack;
public class A13_Infix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Character> op = new Stack<>();
        Stack<Integer> val = new Stack<>();
        System.out.println(str);

        for(int i = 0; i< str.length(); i++){

            char ch = str.charAt(i);
            int ascii = (int) ch;

            if(ascii>= 48 && ascii <= 57)
               val.push(ascii-48);
            else if (op.size () == 0) op.push(ch);
            else {
                if(ch=='+' || ch == '-'){
                    // we will have to do the operation
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '-') val.push(v1-v2);
                    if(op.peek() == '+') val.push(v1+v2);
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);
                }
                else if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek() == '*') val.push(v1*v2);
                        if(op.peek() == '/') val.push(v1/v2);
                        op.pop();
                        op.push(ch);
                    }
                   else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek() == '-') val.push(v1-v2);
            if(op.peek() == '+') val.push(v1+v2);
            if(op.peek() == '*') val.push(v1*v2);
            if(op.peek() == '/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }

}
