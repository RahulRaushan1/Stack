package A16_Stack;

import java.util.Stack;

public class A18_Prefix_Evalulation {
    public static void main(String[] args) {
        String str = "-8/*+5376";

        Stack<Integer> val = new Stack<>();
        System.out.println(str);

        for(int i= str.length()-1;i >= 0;i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){
                val.push(ascii - 48);
            }
            else{
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch == '+') val.push(v1+v2);
                if(ch == '-') val.push(v1-v2);
                if(ch == '*') val.push(v1*v2);
                if(ch == '/') val.push(v1/v2);

            }
        }
        System.out.println(val.peek());
    }
}
