package A16_Stack;
import java.util.Stack;
public class A4_DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
       // System.out.println(st);
        while(! st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
